package com.example.app04;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void onClickShowAlert(View view) {
        print(view);
    }

    public void onClickShowDate(View view) {
        showDatePicker(view);
    }

    public void onClickLogPrint(View view){//뷰의 정보를 자동으로 넣기위해 파라마터를 받아줘야 한다.
        Log.d("나를 부른 view에 대한 정보", view.getId()+"");
        Button button3 = view.findViewById(view.getId());
        button3.setTextColor(Color.RED);
    }

    public void onClickDayPrint(View view){
        Log.d("오늘은 무슨 요일 일까요?", view.getId()+"");
        Button button4 = view.findViewById(view.getId());
        button4.setText("오늘은 월요일 입니다.");
        button4.setTextColor(Color.BLUE);
    }

    public void print(View view) { //alert다이얼로용 출력 메서드 정의!
        Log.d("이 메서드가 호출됨.", "나를 호출한 view는 >> " + view.getId());
        //확인용 만들어서 메시지 띄워보세요!
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity5.this);
        builder.setTitle("경고용 메시지 창");
        builder.setMessage("오늘은 금요일 입니다.!!! 2시간 하시고 퇴근!!!");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "OK를 누르셨군요!!", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "NO를 누르셨군요!!", Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }

    public void showDatePicker(View view){
        DialogFragment dialogFragment = new DatePickerFragment();
        dialogFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void result(final int year, final int month, final int day){//달력 클릭시 실행되는 함수
        AlertDialog.Builder builder = new AlertDialog.Builder(this);//이 액티비티에 올라갈 alert이다.
        builder.setTitle("날짜를 클릭했군");
        builder.setMessage(year + "년" + (month+1) + "월" + day + "일");
        final String s = year + "년"+ (month+1) + "월" + day + "일";//간혹 + 결합 연산을 인식 못할 때는 따로 빼서 변수 설정을 하면 된다.
        //그래도 안되면 final을 앞에 넣어준다.
        builder.setPositiveButton("전달 박은 값 확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();//alert를 보여주기 위해 show() 함수 적용.

        LinearLayout linearLayout5 = findViewById(R.id.lineActivity5);//적용할 액티비티 설정
        final Button button = new Button(getApplicationContext());//버튼 생성
        button.setText(s);//생성된 버튼에 타이틀 넣가
        linearLayout5.addView(button);//linearLayout에 버튼 추가 하기
        //생성한 버튼 생성하여 액티비티 추가하기
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//버튼 클릭시 이벤트 적용
                AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity5.this);//여기 액티비티에 띄우겠다.
                final Calendar c = Calendar.getInstance();//캘린더 생성
                c.set(year, month, day);//프레그먼트에서 넘겨 받은 값을 기준으로 날짜 확인을 위해 set해주기
                int dow = c.get(Calendar.DAY_OF_WEEK);//달력을 int로 가져오기 때문에 날짜를 지정하여 넣어주어야 한다.
                    String dowResult = "";
                    switch (dow) {
                        case 1:
                            dowResult = "일";
                            break;
                        case 2:
                            dowResult = "월";
                            break;
                        case 3:
                            dowResult = "화";
                            break;
                        case 4:
                            dowResult = "수";
                            break;
                        case 5:
                            dowResult = "목";
                            break;
                        case 6:
                            dowResult = "금";
                            break;
                        case 7:
                            dowResult = "토";
                            break;
                    }
                ab.setMessage(dowResult+"요일 버튼을 선택하셨습니다.");//alert 메시지 설정
                ab.show();//alert를 보여주기
            }
        });
    }
}
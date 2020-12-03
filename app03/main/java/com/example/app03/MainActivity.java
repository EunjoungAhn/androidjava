package com.example.app03;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button, button2; //button: 위, button2: 결과보기
    EditText edit1, edit2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.b2);
        edit1 = findViewById(R.id.e1);
        edit2 = findViewById(R.id.e2);
        textResult = findViewById(R.id.text);

        //나를 눌러봐 버튼 처리
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "난 토스트", Toast.LENGTH_LONG).show();
                //화면에 알림 띄우기 androidx.appcompat.app.AlertDialog;
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("나는 눌러봐봐! 버튼 때문에 내가 떴어요!");//제목
                //dlg.setMessage("이곳은 내용이 나타나는 곳이에요!");//내용 넣기
                dlg.setIcon(R.mipmap.ic_launcher);//이미지 넣기
                final String[] array = {"오레오","파이","큐(Q)"};//setMessage대신 나오기 때문에
                //setMessage를 막아주어야 한다.
                dlg.setItems(array, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Log.d("배열에서 가지고 온 값은", array[i]);
                        String result = "";
                        if (i == 0){
                            result ="오레오를 좋아하시는 군요!";
                            Intent intentO = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=mtp_hty.top&where=m&query=%EC%98%A4%EB%A0%88%EC%98%A4"));
                            startActivity(intentO);
                        }else if(i == 1){
                            result ="파이를 좋아하시는 군요!";
                            Intent intentP= new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=mtb_hty.top&where=m&oquery=%EC%98%A4%EB%A0%88%EC%98%A4&tqi=UJ8Bzlprvj4ssUnQjWVssssssvd-062513&query=%ED%8C%8C%EC%9D%B4"));
                            startActivity(intentP);
                        }else if(i == 2){
                            result ="큐를 좋아하시는 군요!";
                            Intent intentQ = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=mtb_hty.top&where=m&oquery=%ED%8C%8C%EC%9D%B4&tqi=UJ8B3dprvyKsscxJAdNssssst5V-339949&query=%ED%81%90"));
                            startActivity(intentQ);
                        }
                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                    }
                });


                dlg.setPositiveButton("확인", null);//이벤트 처리 가능
                dlg.show();
            }
        });

        //결과보기 버튼 처리
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = edit1.getText().toString();//자동 호출이 안되어서 수동으로 toString 설정
                String num2 = edit2.getText().toString();
                int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText(result+"");//int를 스트링으로 하려고 "" 추가
                //textResult.setText(result);//스트링 설정 안하니 에러가 났다
                //결과 찍어 보기
                Log.d("결과 확인: ", result + "");
                Toast.makeText(getApplicationContext(), "더한 결과" + result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

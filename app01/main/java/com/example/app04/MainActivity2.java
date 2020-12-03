package com.example.app04;

        import androidx.appcompat.app.AppCompatActivity;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.AutoCompleteTextView;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.LinearLayout;
        import android.widget.MultiAutoCompleteTextView;

        import java.util.StringTokenizer;

public class MainActivity2 extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    ImageButton getBtn;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflation: 인플레이션(java+ layout)
        //java: 내부적인 처리, 이벤트 처리, 외부와의 통신 등을 담당
        //layout: view를 담당
        setContentView(R.layout.activity_main2);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
        getBtn = findViewById(R.id.getBtn);

        String[] list = {"airplane", "apple", "melon", "strawberry", "watermelon", "banana","orange"};
        //배열에 들어있는 값을 autotextview에 넣을 예정

        //배열(data)에 들어있는 값들을 autotextview에 넣을 예정
        ///adapter: 어탭터!
        // android.R.layout.simple_dropdown_item_1line 내장 객체가 넣어준다.
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, list);
        autoCompleteTextView.setAdapter(adapter);

        //끊어 주는 객체 생성
        final MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setTokenizer(token);//, 콤마로 끊어주는 역할

        //버튼으로 값 가져오기
        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("single 자동완성: ",autoCompleteTextView.getText().toString());
                Log.d("multi 자동완성: ",multiAutoCompleteTextView.getText().toString());
                String autoText = autoCompleteTextView.getText().toString();
                String multiText = multiAutoCompleteTextView.getText().toString();
                String total = autoText +" ,"+multiText;
                Log.d("전체 자동완성:", total);

                //StringTokenizer string 값을 끊어 주는 것
                StringTokenizer tokenizer = new StringTokenizer(total);
                int count = tokenizer.countTokens();
                Log.d("token의 개수: ",count+"개");

                //하나씩 모두 가져오기
                //trim() 공백 제거
                for (int i = 0; i < count; i++){
                    String bT = tokenizer.nextToken(", ").trim();
                    Log.d(i+"번째 토큰: ",bT);

                    linearLayout = findViewById(R.id.linear1);
                    Button button = new Button(getApplicationContext());
                    button.setText(bT);
                    button.setWidth(100);
                    button.setTextSize(15);
                    button.setId(i);
                    linearLayout.addView(button);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Button b = v.findViewById(v.getId());
                            Log.d("버튼을 눌렀음>>>", v.getId()+"야!");
                            if (v.getId() == b.getId()){
                                Log.d(v.getId()+"값을 선택함!>>",v.getId()+"야!!");
                                Log.d(v.getId()+"값을 선택함!>>",b.getText()+"야!!");
                                b.setText("선택됨");
                                b.setBackgroundColor(Color.GREEN);
                                b.setTextColor(Color.BLUE);
                                b.setClickable(false);
                            }else{
                                Log.d(v.getId()+"값을 선택함!>>","empty Id!!");
                            }//if문
                        }
                    });//log 확인 메서드

                }//for문
            }//버튼값 가져오는 onClick메서드
        });


    }
}

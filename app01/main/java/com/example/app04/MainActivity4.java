package com.example.app04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;

import java.util.StringTokenizer;

public class MainActivity4 extends AppCompatActivity {
    MultiAutoCompleteTextView multi4;
    Button abt4;
    LinearLayout lineActivity4;
    ImageView img;
    Button search;
    EditText mons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        multi4 = findViewById(R.id.multi4);
        abt4 = findViewById(R.id.abt4);
        img = findViewById(R.id.img);

        String[] list = {"파이리", "꼬부기", "이상해씨"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, list);
        multi4.setAdapter(adapter);

        //끊어 주는 객체 생성
        final MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        multi4.setAdapter(adapter);
        multi4.setTokenizer(token);
    }

    //자동완성 토큰 버큰 생성 메서드
    public void onClickShowGotcha(View view) {
        gotcha();
    }

    //검색 실행 메서드
    public void onClickShowPs(View view) {
        ps();
    }

    //토큰 버튼 생성
    public void gotcha() {
        abt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("multi 자동완성: ", multi4.getText().toString());
                String autoText = multi4.getText().toString();
                StringTokenizer tokenizer = new StringTokenizer(autoText);
                int count = tokenizer.countTokens();
                for (int i = 0; i < count; i++) {
                    String monster = tokenizer.nextToken(", ").trim();

                    final int[] imageId = {R.drawable.gobu, R.drawable.pa2, R.drawable.leesang};

                    lineActivity4 = findViewById(R.id.lineActivity4);
                    final Button button = new Button(getApplicationContext());
                    button.setText(monster);
                    button.setWidth(100);
                    button.setTextSize(15);
                    button.setId(i);
                    lineActivity4.addView(button);

                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Button ball = v.findViewById(v.getId());
                            Log.d("버튼을 눌렀음>>>", v.getId() + "야!");
                            if (v.getId() == ball.getId()) {
                                Log.d(v.getId() + "값을 선택함!>>", ball.getText() + "야!!");
                                ball.setText("잡혔다!");
                                ball.setBackgroundColor(Color.GREEN);
                                ball.setTextColor(Color.BLUE);
                                img.setImageResource(imageId[v.getId()]);
                                ball.setClickable(false);
                            } else {
                                Log.d(v.getId() + "", "놓쳤다!!");
                            }//if문
                        }
                    });//log 확인 메서드
                }//for문
            }//버튼값 가져오는 onClick메서드
        });
    }

    //포켓몬 검색
    public void ps() {
        mons = findViewById(R.id.mons);
        search = findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = mons.getText().toString();
                Intent searchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pokemonkorea.co.kr/pokedex?word=" + result + "&characters=&area=&snumber=1&snumber2=985&sortselval=number+asc%2Cnumber_count+asc&typetextcs=_________________#pokedex_354"));
                startActivity(searchIntent);
            }
        });
    }
}
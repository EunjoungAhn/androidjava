package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    Button picChange, search;
    ImageView imgOption;
    int i;
    EditText place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        picChange =  findViewById(R.id.picChange);
        imgOption = findViewById(R.id.imgOption);
        place = findViewById(R.id.place);

        picChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0){
                    i = 1;
                    imgOption.setImageResource(R.drawable.city);
                }else if(i == 1){
                    i = 2;
                    imgOption.setImageResource(R.drawable.mountain);
                }else if(i == 2){
                    i = 3;
                    imgOption.setImageResource(R.drawable.ocean);
                }else if(i == 3){
                    i = 0;
                    imgOption.setImageResource(R.drawable.home);
                }
            }
        });

        search = findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = place.getText().toString();
                Intent searchIntent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=mtp_hty.top&where=m&query="+result));
                startActivity(searchIntent);
            }
        });
    }
}

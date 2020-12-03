package com.example.app03;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button b, b2;
    EditText e1, e2;
    TextView text;
    ImageView img;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = findViewById(R.id.img);
        b = findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (i == 0){
                    i = 1;
                    img.setImageResource(R.drawable.ball);
                }else{
                    i = 0;
                    img.setImageResource(R.drawable.hum);
                }

            }
        });

    }
}

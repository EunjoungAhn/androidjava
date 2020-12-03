package com.example.app05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //activity_main는 상수이다.
        setContentView(R.layout.activity_main);//객체의 주소를 내주적으로 넣어서 사용하는 것이다.
        //inflation(인플레이션) = 클래스와 레이아웃을 연결하는 것.

        //tabhost
        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup();

        //탭하나씩 정의
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("SONG").setIndicator("음악별");
        tabSpec1.setContent(R.id.tabSong);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpec2.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpec3.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpec3);

        tabHost.setCurrentTab(0);

        //ViewFlipper
        Button btnPrev, btnNext;
        final ViewFlipper vF1;

        btnPrev = findViewById(R.id.btnPrev);
        btnNext = findViewById(R.id.btnNext);
        vF1 = findViewById(R.id.vF1);
        //이전 버튼 클릭시 보이는 화면
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vF1.showPrevious();
            }
        });
        //다음 버튼 클릭시 보이는 화면
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vF1.showNext();
            }
        });

        //알람 띄우기
        //public void ShowAlert(View v){
        //}
    }
}

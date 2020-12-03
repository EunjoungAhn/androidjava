package com.example.app05;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.ViewFlipper;

public class MyTab extends TabActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_tab);

        TabHost tabHost = getTabHost();

        //탭하나씩 정의
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("home").setIndicator("홈");
        tabSpec1.setContent(R.id.home);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("category").setIndicator("카테고리");
        tabSpec2.setContent(R.id.category);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("gift").setIndicator("선물함");
        tabSpec3.setContent(R.id.gift);
        tabHost.addTab(tabSpec3);

        tabHost.setCurrentTab(0);
        //두번째 탭의 카테고리 형식
        Button chuall = findViewById(R.id.chuall);//추천 버튼
        Button christmas = findViewById(R.id.christmas);//크리스마스 버튼
        Button cheerUp = findViewById(R.id.cheerUp);//응원 버튼
        Button thankYou = findViewById(R.id.thankYou);//감사 버튼
        final ImageView product = findViewById(R.id.product);//버튼 클릭시 이미지 불러오기 위해

        chuall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product.setImageResource(R.drawable.tea);
            }
        });

        christmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product.setImageResource(R.drawable.graytom);
            }
        });

        cheerUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product.setImageResource(R.drawable.plate);
            }
        });

        thankYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product.setImageResource(R.drawable.redtom);
            }
        });

        //ViewFlipper
        final Button btnTake, btnSend;
        final ViewFlipper giftView;

        btnTake = findViewById(R.id.btnTake);
        btnSend = findViewById(R.id.btnSend);
        giftView = findViewById(R.id.giftView);
        //이전 버튼 클릭시 보이는 화면
        btnTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giftView.showPrevious();
                btnTake.setBackgroundColor(Color.parseColor("#d0ff00"));
                btnSend.setBackgroundColor(Color.WHITE);
            }
        });
        //다음 버튼 클릭시 보이는 화면
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giftView.showNext();
                btnSend.setBackgroundColor(Color.parseColor("#d0ff00"));
                btnTake.setBackgroundColor(Color.WHITE);
            }
        });
    }
}

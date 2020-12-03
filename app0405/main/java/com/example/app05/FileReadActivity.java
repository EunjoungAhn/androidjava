package com.example.app05;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadActivity extends AppCompatActivity {
    Button btnRead, btnWrite, open, save;
    EditText t1, t2, t3, t4, searchInfo;
    TextView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_read);

        btnRead = findViewById(R.id.btnRead);
        btnWrite = findViewById(R.id.btnWrite);
        open = findViewById(R.id.open);
        save = findViewById(R.id.save);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        searchInfo = findViewById(R.id.searchInfo);
        list = findViewById(R.id.list);

        //파일 만드는 버튼
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream fileOutputStream = openFileOutput("out.txt", Context.MODE_PRIVATE);
                    String str = "내가 파일에 들어가요..!!";
                    fileOutputStream.write(str.getBytes());//byte로 바꾸어서 가져와야 한다.
                    fileOutputStream.close();//닫는 효과도 있지만,

                    //토스트로 인플레이션하기
                    Toast toast = new Toast(FileReadActivity.this);
                    View view2 = View.inflate(FileReadActivity.this, R.layout.toast1, null);
                    toast.setView(view2);
                    toast.show();
                    //Toast.makeText(getApplicationContext(),"파일이 생성됨.",Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {//읽고 쓰기 관련 예외 처리
                    e.printStackTrace();
                }
            }
        });
        //파일 읽어오는 버튼
        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileInputStream inputStream = openFileInput("file.txt");
                    byte[] txt = new byte[256];
                    inputStream.read(txt);
                    String str = new String(txt);
                    inputStream.close();
                    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "파일없음.", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
        //입력 받은 정보 파일로 저장하는 버튼
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1Txt = t1.getText().toString();
                String t2Txt = t2.getText().toString();
                String t3Txt = t3.getText().toString();
                String t4Txt = t4.getText().toString();

                try {
                    FileOutputStream fileOutputStream = openFileOutput(t1Txt + ".txt", Context.MODE_PRIVATE);
                    String allTxt = t1Txt + "\n" + t2Txt + "\n" + t3Txt + "\n" + t4Txt + "\n";
                    fileOutputStream.write(allTxt.getBytes());
                    fileOutputStream.close();
                    //확인 토스트
                    Toast.makeText(getApplicationContext(), t1Txt + ".txt 파일이 생성됨.", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        //저장된 연락처는 가져오기 버튼
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String userInfo = searchInfo.getText().toString();
                    FileInputStream inputStream = openFileInput(userInfo + ".txt");
                    byte[] txt = new byte[256];
                    inputStream.read(txt);
                    String str = new String(txt);
                    inputStream.close();
                    list.setText(str);

                    //다이얼로그로 인플레이션하여 띄우기
                    View dialogView = View.inflate(FileReadActivity.this, R.layout.dialog1, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(FileReadActivity.this);
                    dlg.setView(dialogView);
                    dlg.setMessage(str);
                    dlg.show();

                    //연락처 정보 토글로도 띄워 보기
                    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "파일없음.", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
    }
}

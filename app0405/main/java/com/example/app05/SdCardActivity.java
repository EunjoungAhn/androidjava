package com.example.app05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SdCardActivity extends AppCompatActivity {
    Button raw_read, sd_read, sd_write, sd_dir_mk, sd_dir_del, sd_list;
    EditText raw_data, raw_data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd_card);

        raw_read = findViewById(R.id.raw_read);
        raw_data = findViewById(R.id.raw_data);
        raw_data2 = findViewById(R.id.raw_data2);
        sd_read = findViewById(R.id.sd_read);
        sd_write = findViewById(R.id.sd_write);
        sd_dir_mk = findViewById(R.id.sd_dir_mk);
        sd_dir_del = findViewById(R.id.sd_dir_del);
        sd_list = findViewById(R.id.sd_list);

        //permission획득해야 작동함, manifest에 설정이 되어야 하며, 가상 머신도 구글 출시 안하는 것으로 만들어 제작해야 한다.
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, MODE_PRIVATE);
//res.raw.raw_test.txt에서 읽어들이기 위한 설정
        raw_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {//파일 스트림을 읽을수 있는 메서드가 getResources() 이다.
                    InputStream inputStream = getResources().openRawResource(R.raw.raw_test);
                    byte[] txt = new byte[inputStream.available()];//파일을 가져오기 위해서 선언
                    inputStream.read(txt);//파일을 읽기
                    raw_data.setText(new String(txt));//읽기 위해 스트링으로 바꾸어 주어야 한다.
                    inputStream.close();
                } catch (FileNotFoundException e) {//에러를 하나씩 보기 위해, 파일 관련 에러 설정
                    e.printStackTrace();
                    Log.d("raw파일 존재 결과>>>","파일이 존재하지 않음");
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.d("raw파일 읽기 결과>>>","파일이 읽는 중 에러 발생");
                }
            }
        });

        //sd카드에 파일 만드는 설정
        sd_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FileOutputStream fileoutputStream = null;
                try {
                    fileoutputStream = new FileOutputStream("/sdcard/xml.xml");
                    String str = "i will be back..!!";
                    fileoutputStream.write(str.getBytes());
                    fileoutputStream.close();
                    //잘 되었는지 확인 toast
                    Toast.makeText(getApplicationContext(), "/sdcard/xml.xml 파일이 생성됨.", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d("sdcard/xml.xml 파일 생성>>","문제 발생");
                }
            }
        });

        //sd카드에 파일 읽어 오는 설정
        sd_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileInputStream fileInputStream = new FileInputStream("/sdcard/xml.xml");//읽을 파일 설정
                    byte[] txt = new byte[fileInputStream.available()];//읽을 파일 byte로 변환 하여 담기
                    fileInputStream.read(txt);//읽기
                    raw_data2.setText(new String(txt));//읽어 온것을 String으로 변환하여 화면에 출력
                    fileInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.d("파일 읽기 중>>","문제 발생");
                }
            }
        });


        final String strSDPath = Environment.getExternalStorageDirectory().getAbsolutePath();
        final File myDir = new File(strSDPath + "/mydir");

        sd_dir_mk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDir.mkdir();
            }
        });

        sd_dir_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDir.delete();
            }
        });

        sd_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sysDir = Environment.getRootDirectory().getAbsolutePath();
                File[] sysFiles = (new File(sysDir).listFiles());

                String string;
                for (int i = 0; i < sysFiles.length; i++) {
                    if (sysFiles[i].isDirectory() != true) {
                        string = "- 폴더>> " + sysFiles[i].toString();
                    } else {
                        string = "- 파일>> " + sysFiles[i].toString();
                    }
                    sd_list.setText(sd_list.getText() + "\n" + string);
                }

            }
        });
    }
}

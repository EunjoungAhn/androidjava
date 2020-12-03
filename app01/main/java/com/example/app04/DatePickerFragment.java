package com.example.app04;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //프레그먼트를 실행시켯을 때 자동 호출되는 메서드
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        Log.d("다이얼로그가 만들어지자마자 캘린더의 변수값을 가지고 와보자 >>", year+"년"+(month+1)+"월"+day+"일");
        return new DatePickerDialog(getActivity(),this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        //날짜를 클릭하면 호출 되는 메서드
        logPrint(year, month, dayOfMonth);
        MainActivity5 activity5 = (MainActivity5)getActivity();
        activity5.result(year, month, dayOfMonth);
    }

    public void logPrint(int year, int month, int date){
        Log.d("선택한 날짜는", year+"년"+month+"월"+date+"일");
    }
}
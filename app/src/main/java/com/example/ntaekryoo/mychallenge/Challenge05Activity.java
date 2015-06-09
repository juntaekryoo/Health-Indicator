
package com.example.ntaekryoo.mychallenge;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Challenge05Activity extends ActionBarActivity {

    private EditText mNameEidtText;
    private EditText mAgeEditText;
    private Button mSaveBtn;
    private Button mBirthdayBtn;
    private DatePicker view;

    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge05);

        mNameEidtText = (EditText) findViewById(R.id.nameInput);
        mAgeEditText = (EditText) findViewById(R.id.ageInput);
        mBirthdayBtn = (Button) findViewById(R.id.dateBtn);
        mSaveBtn = (Button) findViewById(R.id.saveBtn);

        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        mBirthdayBtn.setText(year + " year  " + (month + 1) + " month  " + day + " day");
        
        
        mBirthdayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog date = new DatePickerDialog(Challenge05Activity.this, dateSetListener,year,month,day);
                date.show();
            }
        });
    }

    private DatePickerDialog.OnDateSetListener dateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일");
                    GregorianCalendar tmpCalendar = new GregorianCalendar();
                    tmpCalendar.set(year, monthOfYear, dayOfMonth);

                    mBirthdayBtn.setText(sf.format(tmpCalendar.getTime()));
                    Toast.makeText(getApplicationContext(), sf.format(tmpCalendar.getTime()),
                            Toast.LENGTH_SHORT).show();
                }

            };

}

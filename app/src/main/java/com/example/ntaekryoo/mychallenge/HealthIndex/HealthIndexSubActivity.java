package com.example.ntaekryoo.mychallenge.HealthIndex;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ntaekryoo.mychallenge.R;

public class HealthIndexSubActivity extends ActionBarActivity {

    public static final String KEY_SIMPLE_DATA = "data";
    TextView tHealthIndex01;
    TextView tHealthIndex02;
    TextView tHealthIndex03;
    TextView tHealthIndex04;
    TextView tHealthIndex05;
    TextView tHealthIndex06;
    TextView tHealthIndex07;
    TextView tHealthIndex08;
    TextView tHealthIndex09;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthindex_sub);

        tHealthIndex01 = (TextView) findViewById(R.id.healthindex01);
        tHealthIndex02 = (TextView) findViewById(R.id.healthindex02);
        tHealthIndex03 = (TextView) findViewById(R.id.healthindex03);
        tHealthIndex04 = (TextView) findViewById(R.id.healthindex04);
        tHealthIndex05 = (TextView) findViewById(R.id.healthindex05);
        tHealthIndex06 = (TextView) findViewById(R.id.healthindex06);
        tHealthIndex07 = (TextView) findViewById(R.id.healthindex07);
        tHealthIndex08 = (TextView) findViewById(R.id.healthindex08);
        tHealthIndex09 = (TextView) findViewById(R.id.healthindex09);



        processIntent();
    }

        private void processIntent(){
            Bundle bundle = getIntent().getExtras();

            SimpleData data = (SimpleData)bundle.getParcelable(KEY_SIMPLE_DATA);

            if(data.number1<20.0) {
                tHealthIndex01.setText("체중부족");
            } else if (data.number1> 20 && data.number1 < 25) {
                tHealthIndex01.setText("정상체중");
            } else if (data.number1 > 25 && data.number1 < 30) {
                tHealthIndex01.setText("과체중");
            } else {
                tHealthIndex01.setText("비만");
            }

           if(data.number2 >=160 || data.number3>=100){
                tHealthIndex02.setText("2기고혈압");
           } else if ((data.number2 >=140 && data.number2<160)
                   || (data.number3 >=90 && data.number3<100)){
                tHealthIndex02.setText("1기고혈압");
           } else if ((data.number2 >=120 && data.number2<140)
                   || (data.number3 >=80 && data.number3<90)) {
                tHealthIndex02.setText("전고혈압");
           } else if (data.number2 <=90 && data.number3<60) {
               tHealthIndex02.setText("저혈압");
           } else {
               tHealthIndex02.setText("정상혈압");
           }

            if(data.number4<=200){
                tHealthIndex03.setText("총콜레스테롤 :정상A");
            } else if (data.number4 > 200 && data.number4 < 230) {
                tHealthIndex03.setText("총콜레스테롤 :정상B");
            } else {
                tHealthIndex03.setText("총콜레스테롤 :비정상");
            }

            if (data.number5 >= 60){
                tHealthIndex04.setText("HDL 콜레스테롤 :정상A");
            } else if (data.number5 >= 40 && data.number5 < 60) {
                tHealthIndex04.setText("HDL 콜레스테롤 :정상B");
            } else {
                tHealthIndex04.setText("HDL 콜레스테롤 :비정상");
            }

            if(data.number6 <=130 ){
                tHealthIndex05.setText("LDL 콜레스테롤 :정상A");
            } else if (data.number6 < 130 && data.number6 >130) {
                tHealthIndex05.setText("LDL 콜레스테롤 : 정상B");
            } else {
                tHealthIndex05.setText("LDL 콜레스테롤 ; 비정상");
            }

            if (data.number7 <=150) {
                tHealthIndex06.setText("중성지방 :정상A");
            } else if (data.number7 > 150 && data.number7 <=200) {
                tHealthIndex06.setText("중성지방 :정상B");
            } else {
                tHealthIndex06.setText("중성지방 :비정상");
            }

            if (data.number8 <=40) {
                tHealthIndex07.setText("AST 간지수: 정상A");
            } else if (data.number8 >40 && data.number8 < 50) {
                tHealthIndex07.setText("AST 간지수: 정상B");
            } else {
                tHealthIndex07.setText("AST 간지수: 비정상");
            }

            if (data.number9 <=35) {
                tHealthIndex08.setText("ALT 간지수: 정상A");
            } else if (data.number9 >35 && data.number9 < 45) {
                tHealthIndex08.setText("ALT 간지수: 정상B");
            } else {
                tHealthIndex08.setText("ALT 간지수: 비정상");
            }

            if (data.number10 >=11 && data.number10 <=63) {
                tHealthIndex09.setText("GTP 간지수: 정상A");
            } else if (data.number10 >63 && data.number10 < 77) {
                tHealthIndex09.setText("GTP 간지수: 정상B");
            } else {
                tHealthIndex09.setText("GTP 간지수: 비정상");
            }
    }





    private void showDialog(Button v) {
        final String title = v.getText().toString();

        AlertDialog.Builder builder = new AlertDialog.Builder(HealthIndexSubActivity.this);
        builder.setTitle(title);
        builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(HealthIndexSubActivity.this,"Closed at"+ title,
                        Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }


}

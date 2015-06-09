package com.example.ntaekryoo.mychallenge.Challenge03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.ntaekryoo.mychallenge.R;

public class Challenge03SubActivity extends ActionBarActivity {

    Button mtopBtn;
    Button mmiddleBtn;
    Button mbottomBtn;
    int RESULT_OK = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge03_sub);


        mtopBtn = (Button)findViewById(R.id.topBtn);
        mmiddleBtn = (Button)findViewById(R.id.middleBtn);
        mbottomBtn = (Button)findViewById(R.id.bottomBtn);

        mtopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra("intent","Manage Customers");

                setResult(RESULT_OK,intent);
                finish();
            }
        });

        mmiddleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra("intent","Manage Sales");

                setResult(RESULT_OK, intent);
                finish();
            }
        });



        mbottomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra("intent","Manage Merchants");

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

}

package com.example.ntaekryoo.mychallenge.Challenge04;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ntaekryoo.mychallenge.R;

public class Challenge04SubActivity extends ActionBarActivity {

    Button mCustomerBtn;
    Button mSalesBtn;
    Button mMerchantBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge04_sub);

        mCustomerBtn = (Button)findViewById(R.id.topBtn);
        mSalesBtn = (Button)findViewById(R.id.middleBtn);
        mMerchantBtn = (Button)findViewById(R.id.bottomBtn);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog((Button) v);
            }
        };

        mCustomerBtn.setOnClickListener(onClickListener);
        mSalesBtn.setOnClickListener(onClickListener);
        mMerchantBtn.setOnClickListener(onClickListener);
    }

    private void showDialog(Button v) {
        final String title = v.getText().toString();

        AlertDialog.Builder builder = new AlertDialog.Builder(Challenge04SubActivity.this);
        builder.setTitle(title);
        builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Challenge04SubActivity.this,"Closed at"+ title,
                        Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }


}

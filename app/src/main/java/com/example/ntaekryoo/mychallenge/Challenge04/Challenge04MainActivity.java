
package com.example.ntaekryoo.mychallenge.Challenge04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ntaekryoo.mychallenge.R;

public class Challenge04MainActivity extends ActionBarActivity {

    EditText mId;
    EditText mPassword;

    Button mButtton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge04_main);

        mId = (EditText) findViewById(R.id.nameInput);
        mPassword = (EditText) findViewById(R.id.pwInput);
        mButtton = (Button) findViewById(R.id.buttonLogin);

        mButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(mId.getText()) || TextUtils.isEmpty(mPassword.getText())){
                    Toast.makeText(getApplicationContext(), "Fill in ID and Password",
                            Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(getApplicationContext(), Challenge04SubActivity.class));
                }

            }
        });

    }

}

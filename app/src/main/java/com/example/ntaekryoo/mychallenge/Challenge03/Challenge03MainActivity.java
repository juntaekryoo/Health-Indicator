package com.example.ntaekryoo.mychallenge.Challenge03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ntaekryoo.mychallenge.R;

public class Challenge03MainActivity extends ActionBarActivity {

    public static final int REQUEST_CODE_FRONT = 1001;
    Button mbuttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge03_main);

        mbuttonLogin = (Button) findViewById(R.id.buttonLogin);

        mbuttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge03SubActivity.class);
                startActivityForResult(intent, REQUEST_CODE_FRONT);
            }
        });

    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
            super.onActivityResult(requestCode, resultCode, intent);


                Toast toast = Toast.makeText(getBaseContext(), intent.getStringExtra("intent"),Toast.LENGTH_SHORT);
                toast.show();

    }



}

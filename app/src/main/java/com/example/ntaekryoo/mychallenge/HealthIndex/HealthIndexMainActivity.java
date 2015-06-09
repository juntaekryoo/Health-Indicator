
package com.example.ntaekryoo.mychallenge.HealthIndex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ntaekryoo.mychallenge.R;

public class HealthIndexMainActivity extends ActionBarActivity {

    public static final String KEY_SIMPLE_DATA = "data";

    EditText mHeight;
    EditText mWeight;
    EditText mHbloodpressure;
    EditText mLbloodpressure;
    EditText mTotalcolresterol;
    EditText mHdlcoresterol;
    EditText mLdlcoresterol;
    EditText mFatindex;
    EditText mAST;
    EditText mALT;
    EditText mGTP;
    Button mButton;

    Double nHeight;
    Double nWeight;
    Double nIndex;
    Double nHbloodpressure;
    Double nLbloodpressure;
    Double nTotalcolresterol;
    Double nHdlcolresterol;
    Double nLdlcolresterol;
    Double nFatindex;
    Double nAST;
    Double nALT;
    Double nGTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthindex_main);

        mHeight = (EditText) findViewById(R.id.height);
        mWeight = (EditText) findViewById(R.id.weight);
        mHbloodpressure = (EditText) findViewById(R.id.hbloodpressure);
        mLbloodpressure = (EditText) findViewById(R.id.lbloodpressure);
        mTotalcolresterol = (EditText) findViewById(R.id.totalcolresterol);
        mHdlcoresterol = (EditText) findViewById(R.id.hdlcolresterol);
        mLdlcoresterol = (EditText) findViewById(R.id.ldlcolresterol);
        mFatindex = (EditText) findViewById(R.id.fatindex);
        mAST = (EditText) findViewById(R.id.AST);
        mALT = (EditText) findViewById(R.id.ALT);
        mGTP = (EditText) findViewById(R.id.GTP);

        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nHeight = Double.valueOf(mHeight.getText().toString());
                nWeight = Double.valueOf(mWeight.getText().toString());
                nHbloodpressure = Double.valueOf(mHbloodpressure.getText().toString());
                nLbloodpressure = Double.valueOf(mLbloodpressure.getText().toString());
                nTotalcolresterol = Double.valueOf(mTotalcolresterol.getText().toString());
                nHdlcolresterol = Double.valueOf(mHdlcoresterol.getText().toString());
                nLdlcolresterol = Double.valueOf(mLdlcoresterol.getText().toString());
                nFatindex = Double.valueOf(mFatindex.getText().toString());
                nAST = Double.valueOf(mAST.getText().toString());
                nALT = Double.valueOf(mALT.getText().toString());
                nGTP = Double.valueOf(mGTP.getText().toString());

                if (TextUtils.isEmpty(mHeight.getText()) || TextUtils.isEmpty(mWeight.getText())) {
                    Toast.makeText(getApplicationContext(), "키와 몸무게를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(mHbloodpressure.getText())) {
                    Toast.makeText(getApplicationContext(), "최대혈압을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(mLbloodpressure.getText())) {
                    Toast.makeText(getApplicationContext(), "최소혈압을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(mTotalcolresterol.getText())) {
                    Toast.makeText(getApplicationContext(), "총콜레스테롤을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(mHdlcoresterol.getText())) {
                    Toast.makeText(getApplicationContext(), "HDL콜레스테롤을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(mLdlcoresterol.getText())) {
                    Toast.makeText(getApplicationContext(), "LDL콜레스테롤을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(mFatindex.getText())) {
                    Toast.makeText(getApplicationContext(), "중성지방을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(mAST.getText())) {
                    Toast.makeText(getApplicationContext(), "AST 지수를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(mALT.getText())) {
                    Toast.makeText(getApplicationContext(), "ALT 지수를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(mGTP.getText())) {
                    Toast.makeText(getApplicationContext(), "GTP 지수를 입력하세요",
                            Toast.LENGTH_SHORT).show();
                } else {
                    nIndex =nWeight/ (nHeight / 100.0) /(nHeight / 100.0);
                    Intent intent = new Intent(getApplicationContext(),
                            HealthIndexSubActivity.class);
                    SimpleData data = new SimpleData(nIndex, nHbloodpressure, nLbloodpressure,
                            nTotalcolresterol, nHdlcolresterol, nLdlcolresterol, nFatindex,
                            nAST, nALT, nGTP, "Hello, Index.");
                    intent.putExtra(KEY_SIMPLE_DATA, data);
                    startActivity(intent);
                }
            }
        });
    }
}

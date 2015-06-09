package com.example.ntaekryoo.mychallenge;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Challenge02Activity extends ActionBarActivity {

    private Button mbutton01;
    private EditText mtextInput;
    private TextView mbyteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge02);

        mtextInput = (EditText)findViewById(R.id.textInput);
        mbutton01 = (Button)findViewById(R.id.button01);
        mbyteText = (TextView)findViewById(R.id.byteText);

        mbutton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = mtextInput.getText().toString();
                Toast.makeText(getApplicationContext(), value,Toast.LENGTH_SHORT).show();
                int bytelength = value.getBytes().length;
                mbyteText.setText(bytelength + " / 80 bytes");

            }
        });
    }


}

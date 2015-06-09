
package com.example.ntaekryoo.mychallenge;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Challenge01Activity extends ActionBarActivity {

    Button mbutton02;
    ImageView mimageView01;
    ImageView mimageView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge01);

        mbutton02 = (Button) findViewById(R.id.button02);
        mimageView01 = (ImageView) findViewById(R.id.imageView01);
        mimageView02 = (ImageView) findViewById(R.id.imageView02);

        mbutton02.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button pushed.", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void onButton1Clicked(View v) {


        if (mimageView01.getVisibility() == View.VISIBLE) {
            mimageView01.setVisibility(View.INVISIBLE);
            mimageView02.setVisibility(View.VISIBLE);
        } else {
            mimageView02.setVisibility(View.INVISIBLE);
            mimageView01.setVisibility(View.VISIBLE);
        }

    }

}

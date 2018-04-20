package com.wolfsoft.propertyui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import customfonts.MyTextView;

public class MainActivity2 extends AppCompatActivity {

    MyTextView signin1,signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Typeface custom_fonts = Typeface.createFromAsset(getAssets(), "fonts/Swistblnk Duwhoers Brush.ttf");

        signin1 = (MyTextView)findViewById(R.id.signin1);
        signin = (MyTextView)findViewById(R.id.signin);

        signin.setTypeface(custom_fonts);

        signin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
//                Intent it = new Intent(MainActivity2.this, MainActivity.class);
//                startActivity(it);
            }
        });
    }
}

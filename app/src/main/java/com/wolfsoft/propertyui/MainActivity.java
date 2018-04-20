package com.wolfsoft.propertyui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import customfonts.MyTextView;


public class MainActivity extends AppCompatActivity {
    TextView zoo;
    MyTextView create;
    MyTextView login;
    MyTextView signin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Typeface custom_fonts = Typeface.createFromAsset(getAssets(), "fonts/Swistblnk Duwhoers Brush.ttf");
//        zoo = (TextView)findViewById(R.id.zoo);
//        zoo.setTypeface(custom_fonts);

        signin=findViewById(R.id.signin);
        signin.setTypeface(custom_fonts);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,FirstLoginActivity.class);
                startActivity(it);
            }
        });

        create = (MyTextView)findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(it);

            }
        });
    }
}

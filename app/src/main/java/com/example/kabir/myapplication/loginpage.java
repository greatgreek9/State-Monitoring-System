package com.example.kabir.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginpage extends AppCompatActivity {
    private Button buttontologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        buttontologin =  (Button) findViewById(R.id.buttontologin);
        buttontologin.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               openpageactivityfeed();
                                           }
                                       }
        );
    }
    public void openpageactivityfeed(){
        Intent intent = new Intent(this, activitypage.class);
        startActivity(intent);

    }
}

package com.example.jhayward5.multiactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    public void browser2(View view) {

        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.therewardhub.com/app/#/dxctechnology/home"));
        startActivity(browserIntent); }

}

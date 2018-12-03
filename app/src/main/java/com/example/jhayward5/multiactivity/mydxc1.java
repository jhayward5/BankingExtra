package com.example.jhayward5.multiactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mydxc1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mydxc1);
    }

    public void browser7(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.dxc.com/"));
        startActivity(browserIntent);
    }
}
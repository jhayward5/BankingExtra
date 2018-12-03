package com.example.jhayward5.multiactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class amex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amex);
    }

    public void browser3(View view) {

        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.dxc.com/employee-resources/travel/DXC_CorporateTEcard.html"));
        startActivity(browserIntent); }

}

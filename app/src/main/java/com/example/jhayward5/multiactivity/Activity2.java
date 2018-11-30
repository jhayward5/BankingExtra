package com.example.jhayward5.multiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.santalu.maskedittext.MaskEditText;

public class Activity2 extends AppCompatActivity {

    private MaskEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        editText = findViewById(R.id.sortin);
    }
}

package com.example.jhayward5.multiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.santalu.maskedittext.MaskEditText;

public class Activity4 extends AppCompatActivity {

    private MaskEditText editText;
    private ImageButton helpbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Activity4.this,
                android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        editText = findViewById(R.id.expin);

        helpbutton1 = (ImageButton) findViewById(R.id.helpbutton1);
        helpbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });


        }

    public void openDialog() {
        helpdialogue exampleDialog = new helpdialogue();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");

    }

}











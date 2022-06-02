package com.example.challenge10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View v) {
     TextView textView1 =findViewById(R.id.textView3);
     TextView textView=findViewById(R.id.textView);
     TextView textView3=findViewById(R.id.textView2);
        EditText edtText=findViewById(R.id.editTextTextPersonName2);
        EditText edt=findViewById(R.id.editTextTextPersonName3);
        EditText edtTextName=findViewById(R.id.editTextTextPersonName4);
        textView1.setText(edtText.getText().toString());
        textView.setText(edt.getText().toString());
        textView3.setText(edtTextName.getText().toString());
}}
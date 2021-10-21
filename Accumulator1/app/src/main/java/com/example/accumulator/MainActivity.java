package com.example.accumulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showControls(View v) {
        Button btReset = (Button) findViewById(R.id.btnReset);
        EditText etNumber = (EditText) findViewById(R.id.etNumberMulty);
        CheckBox cbNegativeNumber = (CheckBox) findViewById(R.id.cbNegativeNumber);
        ToggleButton tbShow = (ToggleButton) findViewById(R.id.tbShowControls);
        if(tbShow.isChecked()) {
            btReset.setVisibility(View.GONE);
            etNumber.setVisibility(View.GONE);
            cbNegativeNumber.setVisibility(View.GONE);
        } else {
            btReset.setVisibility(View.VISIBLE);
            etNumber.setVisibility(View.VISIBLE);
            cbNegativeNumber.setVisibility(View.VISIBLE);
        }
    }

    public void showButtonNegative(View v) {
        CheckBox cbNegativeNumber = (CheckBox) findViewById(R.id.cbNegativeNumber);
        Button btnRes = (Button) findViewById(R.id.btnRes);
        if(cbNegativeNumber.isChecked()) {
            btnRes.setVisibility(View.GONE);
        }else {
            btnRes.setVisibility(View.VISIBLE);
        }
    }
}
package com.example.assessment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.assessment2.R;

public class HomeActivity extends AppCompatActivity {

    TextView profile_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profile_txt= findViewById(R.id. profile_txt);

        profile_txt.setText(getIntent().getStringExtra("mobile"));
    }
}
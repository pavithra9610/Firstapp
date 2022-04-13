package com.example.assessment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.assessment2.R;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void openSignup(View view) {
        Intent intent1 = new Intent(SigninActivity.this, com.example.assessment2.MainActivity.class);
        startActivity(intent1);
    }

    public void open_signup(View view) {
    }
}
package com.example.assessment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assessment2.HomeActivity;
import com.example.assessment2.R;
import com.example.assessment2.SignupActivity;

public class MainActivity extends AppCompatActivity {




    Button signinBtn;
    TextView signupBtn;
    EditText mobilEd, passwordEd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signinBtn=findViewById(R.id.signin_btn2);
        mobilEd = findViewById(R.id.mobile_ed);
        passwordEd=findViewById(R.id.password_ed);
        signupBtn=findViewById(R.id.create);

        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //valid with static mobile and password

                String mob=mobilEd.getText().toString();
                String pass=passwordEd.getText().toString();

                if (mob.equals("9876543210")){

                    if (pass.equals("12345")){

                        Intent intent1 = new Intent(MainActivity.this, HomeActivity.class);
                        intent1.putExtra("mobile",mobilEd.getText().toString());
                        intent1.putExtra("password", passwordEd.getText().toString());
                        startActivity(intent1);

                    }else{
                        Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Invalid Mobile", Toast.LENGTH_SHORT).show();

                }
            }
        });
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //LOGICS

                Intent intent1 = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent1);

            }
        });


    }


    public void open_signup(View view) {
    }
}




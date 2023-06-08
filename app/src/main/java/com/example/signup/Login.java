package com.example.signup;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText email2,password2;
    String remail,rpassword;
    Button signInBtn;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email2=findViewById(R.id.editTextTextEmailAddress);
        password2=findViewById(R.id.editTextTextPassword);
        signInBtn=findViewById(R.id.button);
        remail=getIntent().getStringExtra("email");
        rpassword=getIntent().getStringExtra("password");
    }

public void Login(View view)
        {
            String email=email2.getText().toString();
            String password=password2.getText().toString();
            if(remail.equals(email) && rpassword.equals(password))
                {
                    Toast.makeText(this,"Login Success",Toast.LENGTH_LONG).show();
                }
                else
                {
                    count++;
                    if(count>=3)
                     {
                            signInBtn.setEnabled(false);
                     }
                     else
                     {
                         Toast.makeText(this,"invalid",Toast.LENGTH_SHORT).show();
                     }
                }
        }
}
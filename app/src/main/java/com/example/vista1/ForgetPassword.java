package com.example.vista1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i= new Intent(ForgetPassword.this,Login.class);
        startActivity(i);
    }
}
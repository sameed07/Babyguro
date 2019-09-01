package com.sameedshah_squadtech.babyguro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CustomerRegisterActivity extends AppCompatActivity {


    TextView txtAlreadyhaveAnAccount;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_register);

        txtAlreadyhaveAnAccount = findViewById(R.id.txtAlreadyHaveAccount);
        btnRegister  = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CustomerRegisterActivity.this, "Register Successful", Toast.LENGTH_SHORT).show();
            }
        });

        txtAlreadyhaveAnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomerRegisterActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}

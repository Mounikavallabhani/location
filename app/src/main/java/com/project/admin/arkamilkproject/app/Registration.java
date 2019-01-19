package com.project.admin.arkamilkproject.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.project.admin.arkamilkproject.R;

public class Registration extends AppCompatActivity {
    TextView login;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        login=(TextView)findViewById(R.id.login);
        register=findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Registration.this,DashBoard.class);
                startActivity(intent);

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Registration.this,Login.class);
                startActivity(intent);
            }
        });

    }
}

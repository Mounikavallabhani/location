package com.project.admin.arkamilkproject.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.admin.arkamilkproject.R;

public class CheckOut extends AppCompatActivity {
    ImageView checkdecrement,checkincrement;
    TextView checkadd;
    TextView t1,t2,t3,t4,t5;
    int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t5=(TextView)findViewById(R.id.t5);

        t1.setText("\u20B9"+" 25.00");
        t2.setText("\u20B9"+" 25.00");
        t3.setText("\u20B9"+" 0.00");
        t4.setText("\u20B9"+" 0.00");
        t5.setText("\u20B9"+" 25.00");

        checkdecrement=findViewById(R.id.checkdecrement);
        checkincrement=findViewById(R.id.checkincrement);
        checkadd=findViewById(R.id.checkadd);
        checkincrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                checkadd.setText(String.valueOf(count));

            }
        });
        checkdecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count > 1) {
                    count--;
                    checkadd.setText(String.valueOf(count));
                }

            }
        });



    }
}

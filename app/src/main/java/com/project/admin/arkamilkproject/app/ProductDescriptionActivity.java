package com.project.admin.arkamilkproject.app;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.project.admin.arkamilkproject.R;

public class ProductDescriptionActivity  extends AppCompatActivity {
    Button subscribe,deliveryonce;
    ImageView increse, decrese;
    TextView add;
    int count = 1;
    ImageView backbutton;
    LinearLayout descriptionlinerelayout;
    TextView t1,t2,t3,t4;
    Typeface tf_regular1,tf_regular2;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdescription);
        t1=(TextView)findViewById(R.id.t1);
        //t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);

        tf_regular1 = Typeface.createFromAsset(getAssets(), "fonts/six.otf");
        tf_regular2 = Typeface.createFromAsset(getAssets(), "fonts/six.otf");
       // t1.setTypeface(tf_regular1);
       // t2.setTypeface(tf_regular2);
        //t3.setTypeface(tf_regular2);
       // t4.setTypeface(tf_regular2);


        subscribe=(Button)findViewById(R.id.subscribe);
        deliveryonce=(Button)findViewById(R.id.deliveryonce);

        subscribe.setTypeface(tf_regular2);
        deliveryonce.setTypeface(tf_regular2);

        increse = findViewById(R.id.increase);
        decrese = findViewById(R.id.decrease);
        descriptionlinerelayout=findViewById(R.id.descriptionlinerelayout);

        int resId = R.anim.lauoutforside;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(ProductDescriptionActivity.this, resId);
        descriptionlinerelayout.setLayoutAnimation(animation);
        add = findViewById(R.id.add);
        backbutton=findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProductDescriptionActivity.this,DashBoard.class);
                startActivity(intent);
            }
        });
        subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProductDescriptionActivity.this,Subscription.class);
                startActivity(intent);
            }
        });
        deliveryonce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProductDescriptionActivity.this,DeliveryOnce.class);
                startActivity(intent);
            }
        });
        increse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                add.setText(String.valueOf(count));

            }
        });
        decrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count > 1) {
                    count--;
                    add.setText(String.valueOf(count));
                }

            }
        });


    }
}

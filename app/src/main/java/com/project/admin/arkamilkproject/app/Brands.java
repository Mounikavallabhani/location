package com.project.admin.arkamilkproject.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.project.admin.arkamilkproject.Adopter.AdapterDescription;
import com.project.admin.arkamilkproject.R;
import com.project.admin.arkamilkproject.model.ModelDescriptionMilk;

import java.util.ArrayList;

public class Brands extends AppCompatActivity {
    public AdapterDescription adapterDescription;
    RecyclerView recyclerView3;
    GridLayoutManager gridLayoutManager3;
    ArrayList<ModelDescriptionMilk> descriptionlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);
        recyclerView3 = findViewById(R.id.recyclerview3);
        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(Brands.this, resId);
        recyclerView3.setLayoutAnimation(animation);
        descriptionlist = new ArrayList<>();
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        descriptionlist.add(new ModelDescriptionMilk(R.drawable.haritage512, "Heritage", "500ml", "25.00"));
        gridLayoutManager3 = new GridLayoutManager(Brands.this, 1);
        recyclerView3.setLayoutManager(gridLayoutManager3);
        adapterDescription = new AdapterDescription(getApplicationContext(), descriptionlist);
        recyclerView3.setAdapter(adapterDescription);
    }
}
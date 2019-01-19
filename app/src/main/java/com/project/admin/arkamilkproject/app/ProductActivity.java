package com.project.admin.arkamilkproject.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.project.admin.arkamilkproject.Adopter.CustomAdapter;
import com.project.admin.arkamilkproject.Adopter.CustomAdapterMilk;
import com.project.admin.arkamilkproject.model.Model;
import com.project.admin.arkamilkproject.model.ModelMilk;
import com.project.admin.arkamilkproject.R;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    public CustomAdapter adapter;
    public CustomAdapterMilk adapterMilk;
    RecyclerView recyclerView,recyclerView2;
    GridLayoutManager gridLayoutManager,gridLayoutManager1;
    ArrayList<Model>list;
    ArrayList<ModelMilk>productlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        recyclerView=findViewById(R.id.recyclerview1);
        recyclerView2=findViewById(R.id.recyclerview2);
        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(ProductActivity.this, resId);
        recyclerView2.setLayoutAnimation(animation);

        itemName();
    m2();
    }
             public void itemName(){
    list=new ArrayList<>();
        list.add(new Model("Hertage"));
        list.add(new Model("Amul"));
        list.add(new Model("Thirumala"));
        list.add(new Model("Vijaya"));
        list.add(new Model("Jersey"));
        list.add(new Model("Hertage"));


    gridLayoutManager=new GridLayoutManager(ProductActivity.this,3);

        recyclerView.setLayoutManager(gridLayoutManager);

    adapter = new CustomAdapter(getApplicationContext(),list);
        recyclerView.setAdapter(adapter);
             }

    public  void m2(){
        recyclerView2=findViewById(R.id.recyclerview2);
        productlist=new ArrayList<>();
        productlist.add(new ModelMilk(R.drawable.milk,"Heritage","500ml","25.00"));
        productlist.add(new ModelMilk(R.drawable.milk,"Amul","500ml","25.00"));
        productlist.add(new ModelMilk(R.drawable.milk,"Thirumala","500ml","25.00"));
        productlist.add(new ModelMilk(R.drawable.milk,"Vijaya","500ml","25.00"));
        productlist.add(new ModelMilk(R.drawable.milk,"Jersey","500ml","25.00"));
        productlist.add(new ModelMilk(R.drawable.milk,"Heritage","500ml","25.00"));
        productlist.add(new ModelMilk(R.drawable.milk,"Amul","500ml","25.00"));
        productlist.add(new ModelMilk(R.drawable.milk,"Thirumala","500ml","25.00"));
        productlist.add(new ModelMilk(R.drawable.milk,"Vijaya","500ml","25.00"));
        productlist.add(new ModelMilk(R.drawable.milk,"Jersey","500ml","25.00"));
        gridLayoutManager1=new GridLayoutManager(ProductActivity.this,1);
        recyclerView2.setLayoutManager(gridLayoutManager1);
        adapterMilk=new CustomAdapterMilk(getApplicationContext(),productlist);
        recyclerView2.setAdapter(adapterMilk);


    }
}

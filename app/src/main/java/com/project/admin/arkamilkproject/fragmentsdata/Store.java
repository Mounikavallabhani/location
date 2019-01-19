package com.project.admin.arkamilkproject.fragmentsdata;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.admin.arkamilkproject.Adopter.DashBoardViewPagerAdopter;
import com.project.admin.arkamilkproject.Adopter.StoreRecyclerviewAdopter;

import com.project.admin.arkamilkproject.R;
import com.project.admin.arkamilkproject.model.StoreModel;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Store  extends Fragment {

    private static final Integer[] images = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    private ArrayList<Integer> imageArray = new ArrayList<Integer>();
    private static ViewPager mPager;
    private static int currentPage = 0;
    private Intent i;
    View view;



    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    ArrayList<StoreModel> storeModel;
    StoreRecyclerviewAdopter storeRecyclerviewAdopter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      view =inflater.inflate(R.layout.fragment_store,container,false);
      init();
      RecylerviewMethod();
        return view;
    }

    private void init() {
        for (int i = 0; i < images.length; i++)
            imageArray.add(images[i]);

        mPager = (ViewPager)view.findViewById(R.id.pager);
        mPager.setAdapter(new DashBoardViewPagerAdopter(getActivity(), imageArray));
    //    CircleIndicator indicator = (CircleIndicator)view.findViewById(R.id.indicator);
    //    indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == images.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);

    }

   public void RecylerviewMethod(){

        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview);
        linearLayoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

       storeModel=new ArrayList<>();
       storeModel.add(new StoreModel("Dairy",R.drawable.milk_64));
       storeModel.add(new StoreModel("Curd",R.drawable.curd_64));
       storeModel.add(new StoreModel("Bakery",R.drawable.bakery_64));
       storeModel.add(new StoreModel("Pooja",R.drawable.lamp_64));


       recyclerView.setAdapter(new StoreRecyclerviewAdopter(getActivity(),storeModel));

   }
}

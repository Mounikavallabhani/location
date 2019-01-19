package com.project.admin.arkamilkproject.Adopter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.admin.arkamilkproject.model.StoreModel;
import com.project.admin.arkamilkproject.R;
import com.project.admin.arkamilkproject.app.ProductActivity;

import java.util.ArrayList;

public class StoreRecyclerviewAdopter extends RecyclerView.Adapter<StoreRecyclerviewAdopter.MyViewHolder> {

    Context context;
    ArrayList<StoreModel>list;
    public StoreRecyclerviewAdopter(Context activity,ArrayList<StoreModel>list ){
          this.context=activity;
          this.list=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.recuclerview_items,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
               StoreModel storeModel=list.get(i);

        myViewHolder.textView.setText(storeModel.getName());
        myViewHolder.imageView.setImageResource(storeModel.getImage());
        myViewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context.getApplicationContext(),ProductActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
         Typeface tf_regular1;
        public TextView textView;
        public ImageView imageView;
        public LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=(ImageView) itemView.findViewById(R.id.titleimage);
            textView=(TextView)itemView.findViewById(R.id.titletext);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.contaent_liner);
            tf_regular1 = Typeface.createFromAsset(itemView.getContext().getAssets(), "fonts/six.otf");
            /*  Typeface type1 = Typeface.createFromAsset(getAssets(),"fonts/agaramondpro_bold.otf");*/
            this.textView.setTypeface(tf_regular1);

        }
    }
}

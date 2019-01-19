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

import com.project.admin.arkamilkproject.app.ProductDescriptionActivity;
import com.project.admin.arkamilkproject.model.ModelMilk;
import com.project.admin.arkamilkproject.R;

import java.util.ArrayList;

public class CustomAdapterMilk extends RecyclerView.Adapter<CustomAdapterMilk.ViewHolder> {
    Context context;
    LinearLayout recyclerviewonclick;

    public CustomAdapterMilk(Context context, ArrayList<ModelMilk> productlist) {
        this.context = context;
        this.productlist = productlist;

    }

    ArrayList<ModelMilk> productlist;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.productchaild2, parent, false);
        CustomAdapterMilk.ViewHolder vh = new CustomAdapterMilk.ViewHolder(v);
        recyclerviewonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,ProductDescriptionActivity.class);
                context.startActivity(intent);
            }
        });

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final ModelMilk modelMilk=productlist.get(position);
        holder.productname.setText(modelMilk.getProductname());
        holder.productml.setText(modelMilk.getProductml());
        holder.productcost.setText("\u20B9"+modelMilk.getProductcost());
        holder.productimage.setBackgroundResource(modelMilk.getImage());


    }


    @Override
    public int getItemCount() {
        return productlist.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView productname,productml,productcost;
        ImageView productimage;
         Typeface tf_regular1,tf_regular2;

        public ViewHolder(View itemView) {
            super(itemView);
            recyclerviewonclick=itemView.findViewById(R.id.recyclerviewonclick);
            productname = itemView.findViewById(R.id.productname);
            productml=itemView.findViewById(R.id.productml);
            productcost=itemView.findViewById(R.id.productcost);
            productimage=itemView.findViewById(R.id.productimage);
            tf_regular1 = Typeface.createFromAsset(itemView.getContext().getAssets(), "fonts/six.otf");
            tf_regular2 = Typeface.createFromAsset(itemView.getContext().getAssets(), "fonts/six.otf");

            /*  Typeface type1 = Typeface.createFromAsset(getAssets(),"fonts/agaramondpro_bold.otf");*/
            this.productname.setTypeface(tf_regular1);
            this.productml.setTypeface(tf_regular2);
            this.productcost.setTypeface(tf_regular2);

        }

    }
}
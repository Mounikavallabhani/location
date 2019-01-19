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

import com.project.admin.arkamilkproject.R;
import com.project.admin.arkamilkproject.app.ProductDescriptionActivity;
import com.project.admin.arkamilkproject.model.ModelDescriptionMilk;

import java.util.ArrayList;

public class AdapterDescription extends RecyclerView.Adapter<AdapterDescription.ViewHolder> {
    Context context;
    LinearLayout linearlayout,lineronclik;

    public AdapterDescription(Context context, ArrayList<ModelDescriptionMilk> descriptionlist) {
        this.context = context;
        this.descriptionlist = descriptionlist;

    }

    ArrayList<ModelDescriptionMilk> descriptionlist;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.productchiled3, parent, false);
        ViewHolder vh = new ViewHolder(v);


        lineronclik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,ProductDescriptionActivity.class);
                context.startActivity(intent);
            }
        });


        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final ModelDescriptionMilk modelDescriptionMilk=descriptionlist.get(i);
        viewHolder.bproductname.setText(modelDescriptionMilk.getPname());
        viewHolder.bproductml.setText(modelDescriptionMilk.getPml());
        viewHolder.bproductcost.setText("\u20B9"+modelDescriptionMilk.getPcost());
        viewHolder.bproductimage.setBackgroundResource(modelDescriptionMilk.getPimage());




    }


    @Override
    public int getItemCount() {
        return descriptionlist.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView bproductname ,bproductml,bproductcost;
        ImageView bproductimage;
        Typeface tf_regular1,tf_regular2;
        public ViewHolder(View itemView) {
            super(itemView);
            lineronclik=itemView.findViewById(R.id.lineronclik);
          // linearlayout=itemView.findViewById(R.id.linearlayout);
            tf_regular1 = Typeface.createFromAsset(itemView.getContext().getAssets(), "fonts/six.otf");
            tf_regular2 = Typeface.createFromAsset(itemView.getContext().getAssets(), "fonts/six.otf");
            /*  Typeface type1 = Typeface.createFromAsset(getAssets(),"fonts/agaramondpro_bold.otf");*/

            bproductname = itemView.findViewById(R.id.bproductname);
            bproductml=itemView.findViewById(R.id.bproductml);
            bproductcost=itemView.findViewById(R.id.bproductcost);
            bproductimage=itemView.findViewById(R.id.bproductimage);
            this.bproductname.setTypeface(tf_regular1);
            this.bproductml.setTypeface(tf_regular2);
            this.bproductcost.setTypeface(tf_regular2);

        }

    }
}

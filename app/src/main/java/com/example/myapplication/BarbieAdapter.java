package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class BarbieAdapter extends RecyclerView.Adapter<BarbieAdapter.ViewHolder>{

    Context context;
    List<BarbieModel> barbieModels = new ArrayList<>();

    public BarbieAdapter (Context context, List<BarbieModel> barbieModels) {
        this.context = context;
        this.barbieModels = barbieModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_recycler, viewGroup, false);
        ViewHolder holder =  new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BarbieAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.tvName.setText(barbieModels.get(i).getName());
        viewHolder.imageView.setImageResource(barbieModels.get(i).getGambar());
        viewHolder.overview.setText(barbieModels.get(i).getOverview());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, activity_detail.class);
                intent.putExtra("name", barbieModels.get(i).getName());
                intent.putExtra("gambar", barbieModels.get(i).getGambar());
                intent.putExtra("overview", barbieModels.get(i).getOverview());
                context.startActivity(intent);
                Toast.makeText(context, barbieModels.get(i).getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return barbieModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, overview;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_1);
            imageView = itemView.findViewById(R.id.iv_g1);
            overview = itemView.findViewById(R.id.tv_overview);
        }
    }
}

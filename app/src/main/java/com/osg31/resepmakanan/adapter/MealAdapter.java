package com.osg31.resepmakanan.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.osg31.resepmakanan.R;
import com.osg31.resepmakanan.model.Meal;
import com.squareup.picasso.Picasso;


import java.util.List;

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.ViewHolder> {

    private Context context;
    private List<Meal> listMeal;

    public MealAdapter(Context context, List<Meal> listMeal){
        this.context = context;
        this.listMeal = listMeal;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_meal, null, false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(layoutParams);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Meal movies = listMeal.get(position);
        holder.judul.setText(movies.strMeal);
        holder.desc.setText(movies.strCategory);
        holder.tgl.setText(movies.strArea);


    }

    @Override
    public int getItemCount() {
        return listMeal.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gmb;
        private CardView cv;
        private TextView judul, tgl, desc;

        public ViewHolder(View itemView) {
            super(itemView);

            cv = itemView.findViewById(R.id.card_view);
            gmb = itemView.findViewById(R.id.movie_poster);
            judul = itemView.findViewById(R.id.movie_name);
            desc = itemView.findViewById(R.id.movie_desc);
            tgl = itemView.findViewById(R.id.movie_date);
        }
    }

}
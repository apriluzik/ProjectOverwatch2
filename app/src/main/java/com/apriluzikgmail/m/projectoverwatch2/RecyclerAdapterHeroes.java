package com.apriluzikgmail.m.projectoverwatch2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by mapri on 2017-06-26.
 */

public class RecyclerAdapterHeroes extends RecyclerView.Adapter {


    ArrayList<RecyclerHeroesItem> heroesItems;
    Context context;
    Intent intent;
    RelativeLayout selec_layout;

    public RecyclerAdapterHeroes(ArrayList<RecyclerHeroesItem> heroesItems, Context context) {
        this.heroesItems = heroesItems;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemview = LayoutInflater.from(context).inflate(R.layout.recycler_item_main,parent,false);
        RecyclerView.ViewHolder holder = new ViewHolder(itemview);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        RecyclerAdapterHeroes.ViewHolder mholder = (RecyclerAdapterHeroes.ViewHolder)holder;


        Glide.with(context).load(heroesItems.get(position).imgUrl).into(mholder.img);
        mholder.name.setText(heroesItems.get(position).name);

    }

    @Override
    public int getItemCount() {
        return heroesItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView name;

        public ViewHolder(final View itemView) {
            super(itemView);

            img = (ImageView)itemView.findViewById(R.id.hero);
            name = (TextView)itemView.findViewById(R.id.name);


            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {



                    String heroKey = heroesItems.get(getLayoutPosition()).name;
                    int a = getLayoutPosition();

                    intent = new Intent(context,SecondActivity.class);

                    intent.putExtra("Index",a);
                    intent.putExtra("Hero", heroKey);
                    context.startActivity(intent);
                    Log.d("인덱스",a+"-HeroAdapter");


                }
            });

        }
    }

}

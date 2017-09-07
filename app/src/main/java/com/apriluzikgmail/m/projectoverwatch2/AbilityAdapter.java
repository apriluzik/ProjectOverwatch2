package com.apriluzikgmail.m.projectoverwatch2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by mapri on 2017-06-27.
 */

public class AbilityAdapter extends RecyclerView.Adapter {


    ArrayList<RecyclerItemAbilities> abilities;
    Context context;

    public AbilityAdapter(ArrayList<RecyclerItemAbilities> abilities, Context context) {
        this.abilities = abilities;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemview = LayoutInflater.from(context).inflate(R.layout.recycler_item_tab1,parent,false);
        RecyclerView.ViewHolder holder = new ViewHolder(itemview);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ViewHolder mholder = (ViewHolder)holder;


     if(abilities.get(position).name!=null){
         mholder.text.setText(abilities.get(position).intro);
         mholder.textname.setText(abilities.get(position).name);
         Glide.with(context).load(abilities.get(position).img).into(mholder.img);
     }

    }

    @Override
    public int getItemCount() {
        return abilities.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView text;
        TextView textname;

        public ViewHolder(View itemView) {
            super(itemView);
            textname = (TextView)itemView.findViewById(R.id.tab1recyclerNAME);
            img = (ImageView)itemView.findViewById(R.id.tab1recyclerIMG);
            text = (TextView)itemView.findViewById(R.id.tab1recyclerTEXT);

        }
    }

}

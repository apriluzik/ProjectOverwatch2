package com.apriluzikgmail.m.projectoverwatch2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class SecondTab1Fragment extends Fragment {

    ArrayList<RecyclerItemAbilities> abilities = new ArrayList<>();
    AbilityAdapter abilityAdapter;
    RecyclerView recyclerView;
    OverWatch overWatch;

    ImageView img;
    TextView heroname;
    TextView type;
    TextView introHero;
    int index;
    RatingBar ratingBar;
    Intent intent ;

    ImageView tab1Bg;
    String artWork;
    NestedScrollView nestedScrollView;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        overWatch = new OverWatch(index);
        abilities.add( new RecyclerItemAbilities(overWatch.icon_ab1,overWatch.Introduced_ab1,overWatch.Korean_ab1));
        abilities.add( new RecyclerItemAbilities(overWatch.icon_ab2,overWatch.Introduced_ab2,overWatch.Korean_ab2));
        abilities.add( new RecyclerItemAbilities(overWatch.icon_ab3,overWatch.Introduced_ab3,overWatch.Korean_ab3));
        abilities.add( new RecyclerItemAbilities(overWatch.icon_ab4,overWatch.Introduced_ab4,overWatch.Korean_ab4));

        if (overWatch.icon_ab5 != null)
            abilities.add( new RecyclerItemAbilities(overWatch.icon_ab5,overWatch.Introduced_ab5,overWatch.Korean_ab5));

        if(overWatch.icon_ab6!=null)
        abilities.add( new RecyclerItemAbilities(overWatch.icon_ab6,overWatch.Introduced_ab6,overWatch.Korean_ab6));

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second_tab1,container,false);

        nestedScrollView = (NestedScrollView)view.findViewById(R.id.nestscroll);

        tab1Bg = (ImageView)view.findViewById(R.id.tab1Bg);
        intent = getActivity().getIntent();
        index = intent.getIntExtra("Index",0);
        String hero = intent.getStringExtra("Hero");
        artWork = "https://blzgdapipro-a.akamaihd.net/media/artwork/"+hero+"-concept.jpg";


//        Glide.with(view.getContext()).load(artWork).into(tab1Bg);


        img = (ImageView)view.findViewById(R.id.tab1img);
        heroname = (TextView)view.findViewById(R.id.tab1name);
        type = (TextView)view.findViewById(R.id.tab1type);
        introHero = (TextView)view.findViewById(R.id.tab1introHero);


// Rating Bar
        ratingBar = (RatingBar)view.findViewById(R.id.tab1ratingbar);
        ratingBar.setIsIndicator(true);
        ratingBar.setRating(Integer.parseInt(overWatch.Difficuty));

        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(0xffFF9C00, PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(1).setColorFilter(0xffFF9C00, PorterDuff.Mode.SRC_ATOP);


        introHero.setText(overWatch.Introduced);
        Glide.with(view.getContext()).load(overWatch.img).into(img);
        type.setText(overWatch.type);
        heroname.setText(overWatch.Korean);

        recyclerView = view.findViewById(R.id.tab1recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        abilityAdapter = new AbilityAdapter(abilities,getContext());
        recyclerView.setAdapter(abilityAdapter);
        recyclerView.scrollToPosition(0);

        Log.d("err","2");


        return view;
    }

}

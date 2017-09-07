package com.apriluzikgmail.m.projectoverwatch2;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    Intent intent;
    TabLayout tabLayout;
    ViewPager viewPager;
    FragmentAdapter fragmentAdapter;
    String heroKey;

    OverWatch overWatch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String[] names = new String[]
                {"genji", "mccree", "pharah", "soldier-76", "sombra", "tracer",
                        "bastion", "hanzo", "junkrat", "mei", "torbjorn", "widowmaker",
                        "dva", "orisa", "reinhardt", "roadhog", "winston", "zarya",
                        "ana", "lucio", "mercy", "symmetra", "zenyatta"};


        intent = getIntent();


        heroKey = intent.getStringExtra("Hero");
        int index = intent.getIntExtra("Index",0);

        overWatch = new OverWatch(index);


        tabLayout = (TabLayout)findViewById(R.id.layout_tab);
        viewPager = (ViewPager)findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);
        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdapter);



    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }

}

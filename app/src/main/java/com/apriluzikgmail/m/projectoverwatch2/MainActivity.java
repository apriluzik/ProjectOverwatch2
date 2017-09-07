package com.apriluzikgmail.m.projectoverwatch2;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tsengvn.typekit.TypekitContextWrapper;

import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    CoordinatorLayout coordinatorLayout;
    Toolbar toolbar;
    RecyclerView recyclerView;
    NavigationView navigationView;
    RecyclerAdapterHeroes adapterHeroes;
    ArrayList<RecyclerHeroesItem> heroesItems = new ArrayList<>();

    RelativeLayout relativeLayout;
    TextView selecName;
    ImageView selecimg;

    String[] names = new String[]
            {"genji", "mccree", "pharah","reaper", "soldier-76", "sombra", "tracer",
                    "bastion", "hanzo", "junkrat", "mei", "torbjorn", "widowmaker",
                    "dva", "orisa", "reinhardt", "roadhog", "winston", "zarya",
                    "ana", "lucio", "mercy", "symmetra", "zenyatta"};
//    parsingThread parsingThread;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        parsingThread = new parsingThread();
//        parsingThread.start();


        for (int i = 0; i < names.length; i++) {
            url = "https://blzgdapipro-a.akamaihd.net/hero/" + names[i] + "/hero-select-portrait.png";
            heroesItems.add(new RecyclerHeroesItem(url, names[i]));
        }

//        url = parsingThread.heroes.img;


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordi);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_main);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        adapterHeroes = new RecyclerAdapterHeroes(heroesItems, this);
        recyclerView.setAdapter(adapterHeroes);

//        relativeLayout = (RelativeLayout)findViewById(R.id.selec_layout);
//        selecimg = (ImageView)findViewById(R.id.selec_bg);
//        selecName = (TextView)findViewById(R.id.selec_heroname);

        navigationView = (NavigationView)findViewById(R.id.navi);



    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
    //    class parsingThread extends Thread {
//
//        AssetManager assetManager;
//        AssetManager.AssetInputStream ais;
//        BufferedReader reader;
//        String line;
//        String page;// json의 파일내용을 받을거
//
//        JSONObject jsonObject;
//        JSONObject hero;
//        Iterator<String> keys;
//
//        Heroes heroes;
//
//
//        @Override
//        public void run() {
//            assetManager = getResources().getAssets();
//            ais = null;
//
//            try {
//                ais = (AssetManager.AssetInputStream) assetManager.open("json/genji001.json");
//
//                reader = new BufferedReader(new InputStreamReader(ais, "UTF-8"));
//
//                line = null;
//                page = "";
//
//                while ((line = reader.readLine()) != null) {
//
//                    Log.d("line:", line);
//                    page += line;
//                }
//
//                ais.close();
//
//                jsonObject = new JSONObject(page);
//
//                keys = jsonObject.keys();
//
//
//                while (keys.hasNext()) {
//
//                    heroes = new Heroes();
//                    String key = keys.next();
//
//                    hero = new JSONObject(jsonObject.getString(key));
//
//
//                    heroes.name = hero.getString("Name");
//                    heroes.kr_name = hero.getString("KRName");
//                    heroes.real_name = hero.getString("RealName");
//                    heroes.age = hero.getString("Age");
//                    heroes.occupation = hero.getString("Occupation");
//                    heroes.base = hero.getString("Affiliation");
//                    heroes.affiliation = hero.getString("Affiliation");
//                    heroes.subText = hero.getString("SubText");
//                    heroes.mainText = hero.getString("SubText");
//                    heroes.type = hero.getString("Type");
//                    heroes.difficulty = hero.getString("difficulty");
//                    heroes.introduced = hero.getString("Introduced");
//
//                    heroes.name_ab1 = hero.getString("Name_ab1");
//                    heroes.name_ab2 = hero.getString("Name_ab2");
//                    heroes.name_ab3 = hero.getString("Name_ab3");
//                    heroes.name_ab4 = hero.getString("Name_ab4");
//
//                    heroes.img_ab1 = hero.getString("img_ab1");
//                    heroes.img_ab2 = hero.getString("img_ab2");
//                    heroes.img_ab3 = hero.getString("img_ab3");
//                    heroes.img_ab4 = hero.getString("img_ab4");
//
//                    heroes.kr_name_ab1 = hero.getString("KRName_ab1");
//                    heroes.kr_name_ab2 = hero.getString("KRName_ab2");
//                    heroes.kr_name_ab3 = hero.getString("KRName_ab3");
//                    heroes.kr_name_ab4 = hero.getString("KRName_ab4");
//
//                    heroes.introduced_ab1 = hero.getString("Introduced_ab1");
//                    heroes.introduced_ab2 = hero.getString("Introduced_ab2");
//                    heroes.introduced_ab3 = hero.getString("Introduced_ab3");
//                    heroes.introduced_ab4 = hero.getString("Introduced_ab4");
//
//                    if (hero.has("Name_ab5")) {
//                        heroes.img_ab1 = hero.getString("img_ab5");
//                        heroes.kr_name_ab1 = hero.getString("KRName_ab5");
//                        heroes.introduced_ab1 = hero.getString("Introduced_ab5");
//
//                    }
//                    if (hero.has("Name_ab6")) {
//                        heroes.img_ab1 = hero.getString("img_ab6");
//                        heroes.kr_name_ab1 = hero.getString("K6Name_ab6");
//                        heroes.introduced_ab1 = hero.getString("Introduced_ab6");
//
//                    }
//                    heroesArrayList.add(heroes);
//
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//
//        }
//    }//thread
}

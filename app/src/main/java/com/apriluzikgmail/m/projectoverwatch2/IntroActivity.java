package com.apriluzikgmail.m.projectoverwatch2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class IntroActivity extends AppCompatActivity {

    Timer timer = new Timer();
    ImageView introimg;
    Random rnd = new Random();

    String[] imgs = new String[]{
            "https://blzgdapipro-a.akamaihd.net/media/wallpaper/genji-theatrical-mobile.jpg",
            "https://blzgdapipro-a.akamaihd.net/media/wallpaper/mercy-theatrical-mobile.jpg",
            "https://blzgdapipro-a.akamaihd.net/media/wallpaper/dva-wallpaper-mobile.jpg",
            "https://blzgdapipro-a.akamaihd.net/media/wallpaper/soldier-wallpaper-mobile.jpg",
            "https://blzgdapipro-a.akamaihd.net/media/wallpaper/tracer-wallpaper-mobile.jpg",
            "https://blzgdapipro-a.akamaihd.net/media/wallpaper/halloween-terror-mobile.jpg",
            "https://blzgdapipro-a.akamaihd.net/media/wallpaper/winter-wonderland-mobile.jpg",
            "https://blzgdapipro-a.akamaihd.net/media/wallpaper/logo-burst-mobile.jpg",
            "https://blzgdapipro-a.akamaihd.net/media/wallpaper/lineup-mobile.jpg"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);



        introimg = (ImageView)findViewById(R.id.intro_img);
        int n = rnd.nextInt(imgs.length);

        Glide.with(this).load(imgs[n]).into(introimg);
        timer.schedule(task, 3500);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            Intent intent = new Intent(IntroActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    };
}

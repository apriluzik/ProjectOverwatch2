package com.apriluzikgmail.m.projectoverwatch2;

import android.app.Application;
import android.graphics.Typeface;

import com.tsengvn.typekit.Typekit;

/**
 * Created by mapri on 2017-06-29.
 */

public class CustomStartApp extends Application {

        @Override
        public void onCreate() {
            super.onCreate();

            Typekit.getInstance()
                    .addNormal(Typekit.createFromAsset(this, "fonts/koverwatch.ttf"))
                    .addBold(Typekit.createFromAsset(this, "fonts/koverwatch.ttf"))
                    .addCustom1(Typekit.createFromAsset(this, "fonts/koverwatch.ttf"));// "fonts/폰트.ttf"

        }




}

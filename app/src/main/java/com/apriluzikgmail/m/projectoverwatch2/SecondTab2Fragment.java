package com.apriluzikgmail.m.projectoverwatch2;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class SecondTab2Fragment extends Fragment {
    ImageView tab2Bg;

    OverWatch overWatch;
    SecondTab1Fragment secondTab1Fragment;

    TextView sub, main;
    TextView realname, base, occupa, affi, age;
    int index;

    public void  setIndex(int index){
        this.index = index;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = getActivity().getIntent();
        index = intent.getIntExtra("Index",0);
        overWatch = new OverWatch(index);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second_tab2, container, false);
        tab2Bg = (ImageView)view.findViewById(R.id.tab2Bg);


        String s = "";


        Toast.makeText(getContext(), index+"", Toast.LENGTH_SHORT).show();
        sub = (TextView) view.findViewById(R.id.tab2subText);
        main = (TextView) view.findViewById(R.id.tab2MainText);
        realname = (TextView) view.findViewById(R.id.tab2realname);
        base = (TextView) view.findViewById(R.id.tab2Base);
        occupa = (TextView) view.findViewById(R.id.tab2occupation);
        affi = (TextView) view.findViewById(R.id.tab2Affiliation);
        age = (TextView) view.findViewById(R.id.tab2age);





        sub.setText("“ "+ overWatch.subText+" ”");


        main.setText(overWatch.mainText);

        s = "본명 : ";
        s += overWatch.RealName;
        realname.setText(s);

        s= "주거지 : ";
        base.setText(s+=overWatch.base);

        s="직업 : ";
        occupa.setText(s+=overWatch.Occupation);

        s="소속 : ";
        affi.setText(s+=overWatch.Affiliation);

        s="나이 : ";
        age.setText(s+=overWatch.age);


        return view;
    }



}

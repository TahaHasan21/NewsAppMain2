package com.example.NewsAppMain;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    FragmentPageAdp adp;
    TabLayout tabLayout;
    ViewPager vp;
    TabItem mhome,msports,ment,meco;
    Toolbar t1;
    String api ="FNCoTH-WGucUBTv7VrgpsxqDq0kL8JeknM_7GCggG1PTXkR0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(t1);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);


        mhome = (TabItem) findViewById(R.id.Homefr);
        msports = (TabItem) findViewById(R.id.sportsfr);
        ment = (TabItem) findViewById(R.id.enfr);
        meco = (TabItem) findViewById(R.id.ecofr);

        vp = (ViewPager) findViewById(R.id.fragment_container);
        adp = new FragmentPageAdp(getSupportFragmentManager(),tabLayout.getTabCount());

        vp.setAdapter(adp);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3){
                    adp.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



    }


}
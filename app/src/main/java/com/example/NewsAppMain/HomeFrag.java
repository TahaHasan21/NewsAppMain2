package com.example.NewsAppMain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class HomeFrag extends Fragment {

    String api ="FNCoTH-WGucUBTv7VrgpsxqDq0kL8JeknM_7GCggG1PTXkR0";
    Adapter adp;
    ArrayList<InitilizationsMod> modArrayList;
    String country = "in";
    private RecyclerView homerecview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.homefrag,null);
        homerecview = v.findViewById(R.id.homerecycler);
        homerecview.setLayoutManager(new LinearLayoutManager(getContext()));
        adp = new Adapter(getContext(),modArrayList);
        homerecview.setAdapter(adp);
        return v;
    }



}

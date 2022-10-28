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


public class SportsFrag extends Fragment {

    String api ="FNCoTH-WGucUBTv7VrgpsxqDq0kL8JeknM_7GCggG1PTXkR0";
    Adapter adp;
    ArrayList<InitilizationsMod> modArrayList;
    String country = "in";
    private RecyclerView sportsrecview;
    String Category = "sports";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sportsfrag,null);
        sportsrecview = v.findViewById(R.id.sportsrecycler);
        sportsrecview.setLayoutManager(new LinearLayoutManager(getContext()));
        adp = new Adapter(getContext(),modArrayList);
        sportsrecview.setAdapter(adp);
        return v;
    }


}


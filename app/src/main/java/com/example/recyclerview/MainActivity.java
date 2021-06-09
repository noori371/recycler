package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapter.RecentsAdapter;

import com.example.recyclerview.model.RecentsData;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecycler,topPlacesRecycler;
    RecentsAdapter recentsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        List<RecentsData> recentDataList = new ArrayList<>();
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.aa));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.aa));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.aa));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.aa));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.aa));

        setRecentRecycler(recentDataList);



    }



    private void setRecentRecycler(List<RecentsData> recentDataList){
        recentRecycler=(RecyclerView)findViewById(R.id.Recent_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter =new RecentsAdapter(this,recentDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }


}
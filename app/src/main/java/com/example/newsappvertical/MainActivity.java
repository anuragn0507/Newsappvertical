package com.example.newsappvertical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RcvVertical;
    private ProgressBar loadingPB;
    private ArrayList<ArticlesModel> articlesModelArrayList;
    private NewRVAdapter newRVAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RcvVertical =(RecyclerView)findViewById(R.id.idRVNews);
        RcvVertical.setLayoutManager(new LinearLayoutManager(this));
    }
}
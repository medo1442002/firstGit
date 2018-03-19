package com.example.gardenia.recycard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import AdaptorP.Adaptor;
import ListITEM.ListItem;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter myAdaptor;
    List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       listItems= new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recylerVIEWID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        for (int i=0;i<20;i++){
            ListItem item=new ListItem("name"+(i+1),"fname");
            listItems.add(item);
        }
        myAdaptor=new Adaptor(this,listItems) ;
        recyclerView.setAdapter(myAdaptor);

    }
}

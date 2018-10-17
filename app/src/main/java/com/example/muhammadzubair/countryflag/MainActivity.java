package com.example.muhammadzubair.countryflag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<country> lstcountry ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstcountry = new ArrayList<>();
        lstcountry.add(new country("Afghanistan",R.drawable.flagofafghanistan));
        lstcountry.add(new country("Australia",R.drawable.flagofaustralia));
        lstcountry.add(new country("Bangladesh",R.drawable.flagofbangladesh));
        lstcountry.add(new country("Brazil",R.drawable.flagofbrazil));
        lstcountry.add(new country("Canada",R.drawable.flagofcanada));
        lstcountry.add(new country("China",R.drawable.flagofchina));
        lstcountry.add(new country("France",R.drawable.flagoffrance));
        lstcountry.add(new country("Germany",R.drawable.flagofgermany));
        lstcountry.add(new country("India",R.drawable.flagofindia));
        lstcountry.add(new country("Iran",R.drawable.flagofiran));
        lstcountry.add(new country("Ireland",R.drawable.flagofireland));
        lstcountry.add(new country("Israel",R.drawable.flagofisrael));
        lstcountry.add(new country("Kuwait",R.drawable.flagofkuwait));
        lstcountry.add(new country("Nepal",R.drawable.flagofnepal));
        lstcountry.add(new country("Pakistan",R.drawable.flagofpakistan));
        lstcountry.add(new country("Qatar",R.drawable.flagofqatar));
        lstcountry.add(new country("Russia",R.drawable.flagofrussia));
        lstcountry.add(new country("Saudi Arabia",R.drawable.flagofsaudiarabia));
        lstcountry.add(new country("South Africa",R.drawable.flagofsouthafrica));
        lstcountry.add(new country("Sri Lanka",R.drawable.flagofsrilanka));
        lstcountry.add(new country("Switzerland",R.drawable.flagofswitzerland));
        lstcountry.add(new country("Syria",R.drawable.flagofsyria));
        lstcountry.add(new country("Turkey",R.drawable.flagofturkey));
        lstcountry.add(new country("United Arab Emirates",R.drawable.flagofunitedarabemirates));
        lstcountry.add(new country("United Kingdom",R.drawable.flagofunitedkingdom));
        lstcountry.add(new country("United States of America",R.drawable.flagofunitedstatesofamerica));
        lstcountry.add(new country("Zimbabwe",R.drawable.flagofzimbabwe));


        RecyclerView my_rcview = (RecyclerView) findViewById(R.id.recyclerview_id);
        MyAdapter madapter = new MyAdapter(this, lstcountry);
        my_rcview.setLayoutManager(new GridLayoutManager(this, 3));
        my_rcview.setAdapter(madapter);
    }
}

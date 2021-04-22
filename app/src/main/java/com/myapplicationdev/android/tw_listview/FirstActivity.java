package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Year> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        al = new ArrayList<Year>();
        al.add(new Year("Year 1"));
        al.add(new Year("Year 2"));
        al.add(new Year("Year 3"));

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                switch( position )
                {
                    case 0:
                        i.putExtra(Intent.EXTRA_TEXT,"Year 1");
                        break;
                    case 1:
                        i.putExtra(Intent.EXTRA_TEXT,"Year 2");
                        break;
                    case 2:
                        i.putExtra(Intent.EXTRA_TEXT,"Year 3");
                        break;
                }
                startActivity(i);
            }
        });



    }
}

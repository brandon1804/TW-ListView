package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ImageView iv;
    ArrayList<Module> y1moduleList, y2moduleList, y3moduleList;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        // create module objects
        y1moduleList = new ArrayList<Module>();
        y2moduleList = new ArrayList<Module>();
        y3moduleList = new ArrayList<Module>();

        y1moduleList.add(new Module("C105" , true));
        y1moduleList.add(new Module("G961" , false));
        y1moduleList.add(new Module("G107" , true));

        y2moduleList.add(new Module("C348" , true));
        y2moduleList.add(new Module("C200" , false));
        y2moduleList.add(new Module("C346" , true));

        y3moduleList.add(new Module("C347" , true));
        y3moduleList.add(new Module("C349" , true));
        y3moduleList.add(new Module("C302" , true));


        if(year.equals("Year 1")){
            aa = new ModuleAdapter(this, R.layout.row, y1moduleList);
        }
        else if(year.equals("Year 2")){
            aa = new ModuleAdapter(this, R.layout.row, y2moduleList);
        }
        else if(year.equals("Year 3")){
            aa = new ModuleAdapter(this, R.layout.row, y3moduleList);
        }


        lv.setAdapter(aa);

    }
}

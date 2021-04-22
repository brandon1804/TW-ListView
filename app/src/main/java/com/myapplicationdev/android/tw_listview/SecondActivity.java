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
    TextView tvModule;
    ImageView iv;
    ArrayList<Module> moduleList;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tvModule = (TextView) findViewById(R.id.tvYear);

        // create module objects
        moduleList = new ArrayList<Module>();
        moduleList.add(new Module("C208" , true));
        moduleList.add(new Module("C200" , false));
        moduleList.add(new Module("C346" , true));

        aa = new ModuleAdapter(this, R.layout.row, moduleList);
        lv.setAdapter(aa);

        Intent i = getIntent();


    }
}

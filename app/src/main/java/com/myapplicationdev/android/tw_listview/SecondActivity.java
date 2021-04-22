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
    TextView tv;
    ImageView iv;
    ArrayList<Module> module;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModule);
        tv = (TextView) findViewById(R.id.tvYear);

        // create module objects
        module = new ArrayList<Module>();
        module.add(new Module("C208" , true));
        module.add(new Module("C200" , false));
        module.add(new Module("C346" , true));

        aa = new ModuleAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);

        Intent year = getIntent();

        for(int i = 0; i < module.size(); i++) {
            String moduleName = module.get(i).getModule();
            boolean isProg = module.get(i).isProg();
            tv.setText(moduleName);
            if (isProg == true){
                iv.setImageResource(R.drawable.prog);
            }else{
                iv.setImageResource(R.drawable.nonprog);
            }
        }

    }
}

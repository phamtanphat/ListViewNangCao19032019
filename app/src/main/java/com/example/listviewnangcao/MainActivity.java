package com.example.listviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonan;
    ArrayList<Monan> monanArrayList = new ArrayList<>();
    MonanAdapter monanAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonan = findViewById(R.id.listviewMonan);

//        Monan monan1 =
        monanArrayList.add(new Monan("Bánh mì",3000,0,R.drawable.banhmy));
        monanArrayList.add(new Monan("Chả chiên",25000,1,R.drawable.cha));
        monanArrayList.add(new Monan("Chả giò",35000,2,R.drawable.chagio));
        monanArrayList.add(new Monan("Mì cay",45000,3,R.drawable.mycay));
        monanArrayList.add(new Monan("Ốc",50000,4,R.drawable.oc));


        monanAdapter = new MonanAdapter(MainActivity.this,android.R.layout.simple_list_item_1,monanArrayList);
        lvMonan.setAdapter(monanAdapter);

        lvMonan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                monanArrayList.add(0,new Monan("Ốc",50000,4,R.drawable.oc));
                monanAdapter.notifyDataSetChanged();
            }
        });
    }
}

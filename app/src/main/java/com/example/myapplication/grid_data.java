package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class grid_data extends AppCompatActivity {

    GridView gridView;
    ImageButton backhome;


    String[] namedh = {"IPhone 4","IPhone 5","IPhone 6","IPhone 7","IPhone 8","IPhone X","IPhone 11","IPhone 12"};
    int[] images = {R.drawable.ip4,R.drawable.ip5,R.drawable.ip6,R.drawable.ip7,R.drawable.ip8,R.drawable.ipx,R.drawable.ip11,R.drawable.ip12};
    String[] giadh = {"450.000 ₫","1.600.000 ₫","2.200.000 ₫","4.600.000 ₫","7.850.000 ₫","11.800.000 ₫","13.000.000 ₫","18.000.000 ₫"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gird);

        //finding listview
        gridView = findViewById(R.id.gridview);
        backhome = findViewById(R.id.backhome);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),namedh[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),grid_item.class);
                intent.putExtra("name",namedh[i]);
                intent.putExtra("image",images[i]);
                intent.putExtra("gia",giadh[i]);
                startActivity(intent);
            }
        });
        backhome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(grid_data.this, HomeActivity.class);
                startActivity(it);
            }
        });

    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return namedh.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.idip);
            ImageView image = view1.findViewById(R.id.imageView);
            TextView gia = view1.findViewById(R.id.idgia);

            name.setText(namedh[i]);
            image.setImageResource(images[i]);
            gia.setText(giadh[i]);
            return view1;
        }
    }
}
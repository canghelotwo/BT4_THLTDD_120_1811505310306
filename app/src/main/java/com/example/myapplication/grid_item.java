package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class grid_item extends AppCompatActivity {

    TextView idip,idgia;
    ImageView imageView;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctsp);

        idip = findViewById(R.id.idip);
        imageView = findViewById(R.id.imageView);
        idgia = findViewById(R.id.idgia);
        back = findViewById(R.id.back);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        String receivedGia =  intent.getStringExtra("gia");

        idip.setText(receivedName);
        imageView.setImageResource(receivedImage);
        idgia.setText(receivedGia);
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(grid_item.this,grid_data.class);
                startActivity(it);
            }
        });
    }


}
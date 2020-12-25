package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    Button btn_dx,btn_sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_dx =(Button) findViewById(R.id.btn_dangxuat);
        btn_sp =(Button) findViewById(R.id.btn_sanpham);
        btn_dx.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Đăng Xuất Thành Công", Toast.LENGTH_LONG).show();
                Intent it =new Intent(HomeActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
        btn_sp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Toast.makeText(HomeActivity.this, "Đăng Xuất Thành Công", Toast.LENGTH_LONG).show();
                Intent it =new Intent(HomeActivity.this, grid_data.class);
                startActivity(it);
            }
        });
    }
}
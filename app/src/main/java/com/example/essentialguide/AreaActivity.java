package com.example.essentialguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.essentialguide.Category1Activity;
import com.example.essentialguide.Category2Activity;
import com.example.essentialguide.Category3Activity;
import com.example.essentialguide.Category4Activity;
import com.example.essentialguide.Category5Activity;
import com.example.essentialguide.R;

public class AreaActivity extends AppCompatActivity {
    Button area1 ;
    Button area2 ;
    Button area3 ;
    Button area4 ;
    Button area5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        area1 = (Button) findViewById(R.id.area1);
        area1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory1Page();
            }
        });

        area2 = (Button) findViewById(R.id.area2);
        area2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory2Page();
            }
        });

        area3 = (Button) findViewById(R.id.area3);
        area3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory3Page();
            }
        });

        area4 = (Button) findViewById(R.id.area4);
        area4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory4Page();
            }
        });

        area5 = (Button) findViewById(R.id.area5);
        area5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory5Page();
            }
        });
    }

    public void openCategory1Page()
    {
        Intent intent = new Intent(this , Category1Activity.class);
        startActivity(intent);
    }

    public void openCategory2Page()
    {
        Intent intent = new Intent(this , Category2Activity.class);
        startActivity(intent);
    }

    public void openCategory3Page()
    {
        Intent intent = new Intent(this , Category3Activity.class);
        startActivity(intent);
    }

    public void openCategory4Page()
    {
        Intent intent = new Intent(this , Category4Activity.class);
        startActivity(intent);
    }

    public void openCategory5Page()
    {
        Intent intent = new Intent(this , Category5Activity.class);
        startActivity(intent);
    }

}
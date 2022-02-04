package kr.ac.yonsei.testproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MyClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_class);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //-----내클 1 as mc1 --------------------------------------------------
        LinearLayout mc1 = findViewById(R.id.mc1);
        ImageView mc1Back = findViewById(R.id.mc1Back);
        ImageView mc1List = findViewById(R.id.mc1List);
        LinearLayout mc2 = findViewById(R.id.mc2);    //mc2 views


        mc1Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  .setVisibility(View.VISIBLE); //매인으로 이동
                //mc1.setVisibility(View.INVISIBLE);
                finish();
            }
        });
        mc1List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc1.setVisibility(View.INVISIBLE);
                mc2.setVisibility(View.VISIBLE);
            }
        });
        //-----내클 2 as mc2 --------------------------------------------------
        ImageView mc2Back = findViewById(R.id.mc2Back);
        ImageView mc2List1 = findViewById(R.id.mc2List1);
        ImageView mc2List2 = findViewById(R.id.mc2List2);
        ImageView mc2List3 = findViewById(R.id.mc2List3);
        //mc3 views
        ScrollView mc31 = findViewById(R.id.mc31);
        ScrollView mc32 = findViewById(R.id.mc32);
        ScrollView mc33 = findViewById(R.id.mc33);

        mc2Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc1.setVisibility(View.VISIBLE);
                mc2.setVisibility(View.INVISIBLE);
            }
        });
        mc2List1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*우영*/
                mc31.setVisibility(View.VISIBLE);
                mc2.setVisibility(View.INVISIBLE);
            }
        });
        mc2List2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*윤지*/
                mc32.setVisibility(View.VISIBLE);
                mc2.setVisibility(View.INVISIBLE);
            }
        });
        mc2List3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*희준*/
                mc33.setVisibility(View.VISIBLE);
                mc2.setVisibility(View.INVISIBLE);
            }
        });

        //-----내클 3 as mc31 최우영 --------------------------------------------------
        ImageView mc3Back1 = findViewById(R.id.mc3Back1);
        Button mc3Return1 = findViewById(R.id.mc3Return1);


        mc3Back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc2.setVisibility(View.VISIBLE);
                mc31.setVisibility(View.INVISIBLE);
            }
        });
        mc3Return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc2.setVisibility(View.VISIBLE);
                mc31.setVisibility(View.INVISIBLE);
            }
        });

        //-----내클 3 as mc32 남윤지 --------------------------------------------------
        ImageView mc3Back2 = findViewById(R.id.mc3Back2);
        Button mc3Return2 = findViewById(R.id.mc3Return2);


        mc3Back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc2.setVisibility(View.VISIBLE);
                mc32.setVisibility(View.INVISIBLE);
            }
        });
        mc3Return2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc2.setVisibility(View.VISIBLE);
                mc32.setVisibility(View.INVISIBLE);
            }
        });

        //-----내클 3 as mc33 박희준 --------------------------------------------------
        ImageView mc3Back3 = findViewById(R.id.mc3Back3);
        Button mc3Return3 = findViewById(R.id.mc3Return3);


        mc3Back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc2.setVisibility(View.VISIBLE);
                mc33.setVisibility(View.INVISIBLE);
            }
        });
        mc3Return3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc2.setVisibility(View.VISIBLE);
                mc33.setVisibility(View.INVISIBLE);
            }
        });
    }
}
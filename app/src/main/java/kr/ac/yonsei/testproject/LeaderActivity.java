package kr.ac.yonsei.testproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class LeaderActivity extends AppCompatActivity {
    String ClassName = "";
    String Q1, Q2, Q3, Q4;
    String A1, A2, A3, A4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //-----리드 1--------------------------------------------------
        FrameLayout l1 = findViewById(R.id.l1);
        l1.setVisibility(View.VISIBLE);
        ImageView l1Back = findViewById(R.id.l1Back);
        EditText l1ClassName = findViewById(R.id.l1ClassName);
        Button l1Create = findViewById(R.id.l1Create);
        ScrollView l2 = findViewById(R.id.l2);

        l1Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        l1Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassName = l1ClassName.getText().toString();
                l1.setVisibility(View.INVISIBLE);
                l2.setVisibility(View.VISIBLE);
            }
        });

        //-----리드 2--------------------------------------------------
        ImageView l2Back = findViewById(R.id.l2Back);
        EditText l2Q1 = findViewById(R.id.l2Q1);
        EditText l2Q2 = findViewById(R.id.l2Q2);
        EditText l2Q3 = findViewById(R.id.l2Q3);
        EditText l2Q4 = findViewById(R.id.l2Q4);
        Button l2Next = findViewById(R.id.l2Next);
        ScrollView l3 = findViewById(R.id.l3); //리드 3 views
        TextView l3Q1 = findViewById(R.id.l3Q1);
        TextView l3Q2 = findViewById(R.id.l3Q2);
        TextView l3Q3 = findViewById(R.id.l3Q3);
        TextView l3Q4 = findViewById(R.id.l3Q4);

        l2Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.INVISIBLE);
            }
        });
        l2Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l2.setVisibility(View.INVISIBLE);
                l3.setVisibility(View.VISIBLE);
                Q1 = l2Q1.getText().toString(); //질문 저장
                Q2 = l2Q2.getText().toString();
                Q3 = l2Q3.getText().toString();
                Q4 = l2Q4.getText().toString();
                l3Q1.setText(Q1);   //리드 3 질문 바꾸기
                l3Q2.setText(Q2);
                l3Q3.setText(Q3);
                l3Q4.setText(Q4);
            }
        });

        //-----리드 3--------------------------------------------------
        ImageView l3Back = findViewById(R.id.l3Back);
        EditText l3A1 = findViewById(R.id.l3A1);
        EditText l3A2 = findViewById(R.id.l3A2);
        EditText l3A3 = findViewById(R.id.l3A3);
        EditText l3A4 = findViewById(R.id.l3A4);
        Button l3Next = findViewById(R.id.l3Next);
        ScrollView l4 = findViewById(R.id.l4); //리드 4 views
        TextView l4Q1 = findViewById(R.id.l4Q1);
        TextView l4Q2 = findViewById(R.id.l4Q2);
        TextView l4Q3 = findViewById(R.id.l4Q3);
        TextView l4Q4 = findViewById(R.id.l4Q4);
        TextView l4A1 = findViewById(R.id.l4A1);
        TextView l4A2 = findViewById(R.id.l4A2);
        TextView l4A3 = findViewById(R.id.l4A3);
        TextView l4A4 = findViewById(R.id.l4A4);

        l3Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l2.setVisibility(View.VISIBLE);
                l3.setVisibility(View.INVISIBLE);
            }
        });
        l3Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l3.setVisibility(View.INVISIBLE);
                l4.setVisibility(View.VISIBLE);
                A1 = l3A1.getText().toString(); //질문 저장
                A2 = l3A2.getText().toString();
                A3 = l3A3.getText().toString();
                A4 = l3A4.getText().toString();
                l4Q1.setText(Q1);   //리드 4 질문 답 바꾸기
                l4Q2.setText(Q2);
                l4Q3.setText(Q3);
                l4Q4.setText(Q4);
                l4A1.setText(A1);
                l4A2.setText(A2);
                l4A3.setText(A3);
                l4A4.setText(A4);
            }
        });

        //-----리드 4--------------------------------------------------
        ImageView l4Back = findViewById(R.id.l4Back);
        Button l4Finish = findViewById(R.id.l4Finish);
        LinearLayout l5 = findViewById(R.id.l5);        //리드 5 view
        TextView l5Title = findViewById(R.id.l5Title);

        l4Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l3.setVisibility(View.VISIBLE);
                l4.setVisibility(View.INVISIBLE);
            }
        });
        l4Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l4.setVisibility(View.INVISIBLE);
                l5.setVisibility(View.VISIBLE);
                l5Title.setText("“ " + ClassName + " ”");
            }
        });

        //-----리드 5--------------------------------------------------
        ImageView l5Home = findViewById(R.id.l5Home);
        Button l5Go = findViewById(R.id.l5Go);
        LinearLayout mc2 = findViewById(R.id.mc2);    //mc2 views
        //ImageView mc2List = findViewById(R.id.mc2List);

        l5Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // .setVisibility(View.VISIBLE); 메인으로 이동
                //l5.setVisibility(View.INVISIBLE);
                finish();
            }
        });
        l5Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mc2.setVisibility(View.VISIBLE);
                //l5.setVisibility(View.INVISIBLE);
                //mc2List.setVisibility(View.INVISIBLE);  //처음에는 안 보이게
                finish();
            }
        });

        /*ListView
        ArrayList<String> midList = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, midList);
        list.setAdapter(adapter);

        midList.add("   1                    82                    김진성");
        midList.add("   2                    65                    남윤지");
        midList.add("   3                    62                    박희준");
        midList.add("   4                    48                    최우영");
        adapter.notifyDataSetChanged();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                l5.setVisibility(View.INVISIBLE);
                l6.setVisibility(View.VISIBLE);

            }
        });
        */
    }
}
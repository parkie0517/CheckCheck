package kr.ac.yonsei.testproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        /* 다음으로 이동하는 버튼들 */
        findViewById(R.id.btnMember1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.memberLayout1).setVisibility(View.INVISIBLE);
                findViewById(R.id.memberLayout2).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.btnMember2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.memberLayout2).setVisibility(View.INVISIBLE);
                findViewById(R.id.memberLayout3).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.btnMember3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.memberLayout3).setVisibility(View.INVISIBLE);
                findViewById(R.id.memberLayout4).setVisibility(View.VISIBLE);
                ((TextView)findViewById(R.id.show1)).setText(((TextView)findViewById(R.id.answer1)).getText());
                ((TextView)findViewById(R.id.show2)).setText(((TextView)findViewById(R.id.answer2)).getText());
                ((TextView)findViewById(R.id.show3)).setText(((TextView)findViewById(R.id.answer3)).getText());
                ((TextView)findViewById(R.id.show4)).setText(((TextView)findViewById(R.id.answer4)).getText());
            }
        });
        findViewById(R.id.btnMember4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.memberLayout4).setVisibility(View.INVISIBLE);
                findViewById(R.id.memberLayout5).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.btnMember5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //findViewById(R.id.memberLayout5).setVisibility(View.VISIBLE);
                //findViewById(R.id.mainLayout).setVisibility(View.INVISIBLE);
                finish();
            }
        });

        /* 뒤로가기 버튼들 */
        findViewById(R.id.btnBack1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                findViewById(R.id.memberLayout1).setVisibility(View.VISIBLE);
                findViewById(R.id.memberLayout2).setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.btnBack2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.memberLayout2).setVisibility(View.INVISIBLE);
                findViewById(R.id.memberLayout1).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.btnBack3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.memberLayout3).setVisibility(View.INVISIBLE);
                findViewById(R.id.memberLayout2).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.btnBack4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.memberLayout4).setVisibility(View.INVISIBLE);
                findViewById(R.id.memberLayout3).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.btnMemberHome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
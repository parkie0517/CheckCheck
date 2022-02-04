package kr.ac.yonsei.testproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    Button btnLogin;
    static String TAG = "PROJECT";

    DBConnector dbConnector;
    SQLiteDatabase sqlDB;

    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                findViewById(R.id.loading).setVisibility(View.GONE);
                findViewById(R.id.loginLayout).setVisibility(View.VISIBLE);
            }
        }, 2000); // 화면에 Logo 2초간 보이기
    }// startLoading Method..

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startLoading();

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        /* 로그인 버튼*/
        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.loginLayout).setVisibility(View.INVISIBLE);
                findViewById(R.id.main).setVisibility(View.VISIBLE);

            }
        });

        /*계정정보 버튼*/
        findViewById(R.id.mainRight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.main).setVisibility(View.INVISIBLE);
                findViewById(R.id.accountLayout).setVisibility(View.VISIBLE);
            }
        });

        /* 계정정보 뒤로가기 버튼*/
        findViewById(R.id.btnAccountBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.main).setVisibility(View.VISIBLE);
                findViewById(R.id.accountLayout).setVisibility(View.INVISIBLE);
            }
        });

        //자바 코드 버튼눌었을 때 클릭 이벤트만 처리하면 됩니다!
        LinearLayout main = findViewById(R.id.main);        //view id
        ImageView mainLeft = findViewById(R.id.mainLeft);   //좌측 상단 물음표 버튼
        ImageView mainRight = findViewById(R.id.mainRight); //우측 상단 사람 버튼
        Button mainLeader = findViewById(R.id.mainLeader);  //리더로 참여 버튼
        Button mainMember = findViewById(R.id.mainMember);  //멤버로 참여 버튼
        Button mainClass = findViewById(R.id.mainClass);    //내가 만든 클래스 버튼

        mainLeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //리더 액티비티 호출
                Intent intent = new Intent(getApplicationContext(), LeaderActivity.class);
                startActivity(intent);
            }
        });
        mainMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //맴버 액티비티 호출
                Intent intent = new Intent(getApplicationContext(), MemberActivity.class);
                startActivity(intent);
            }
        });
        mainClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //내클래스보기 액티비티 호출
                Intent intent = new Intent(getApplicationContext(), MyClassActivity.class);
                startActivity(intent);
            }
        });

        /*findViewById(R.id.btnMember1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //로그인 화면 숨기고 메인으로 이동한다.
                findViewById(R.id.ll1).setVisibility(View.INVISIBLE);
                findViewById(R.id.ll2).setVisibility(View.VISIBLE);

            }
        });

        findViewById(R.id.btnMember2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //메인화면 숨기고 account화면으로 이동
                findViewById(R.id.ll2).setVisibility(View.INVISIBLE);
                findViewById(R.id.ll3).setVisibility(View.VISIBLE);

            }
        });

        findViewById(R.id.btnMember3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //account에서 메인으로 이동
                findViewById(R.id.ll3).setVisibility(View.INVISIBLE);
                findViewById(R.id.ll4).setVisibility(View.VISIBLE);

            }
        });*/

        /*findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //로그인 화면 숨기고 메인으로 이동한다.
                findViewById(R.id.ll1).setVisibility(View.INVISIBLE);
                findViewById(R.id.ll3).setVisibility(View.VISIBLE);

            }
        });*/

        /*findViewById(R.id.btnAccount).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //메인화면 숨기고 account화면으로 이동
                findViewById(R.id.ll3).setVisibility(View.INVISIBLE);
                findViewById(R.id.ll2).setVisibility(View.VISIBLE);

            }
        });

        findViewById(R.id.btnAccountBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //account에서 메인으로 이동
                findViewById(R.id.ll2).setVisibility(View.INVISIBLE);
                findViewById(R.id.ll3).setVisibility(View.VISIBLE);

            }
        });*/

        /*findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/

        /*findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = ((EditText)findViewById(R.id.etId)).getText().toString();
                String pw = ((EditText)findViewById(R.id.etPw)).getText().toString();

                dbConnector = new DBConnector(MainActivity.this);
                sqlDB = dbConnector.getReadableDatabase();
                String query = "SELECT COUNT(*) FROM tbl_user where id = \'"+id+"\'and pwd = '"+pw+"\';";
                Log.e(TAG, "onClick: "+query, null);
                Cursor cursor = sqlDB.rawQuery(query, null);

                if(cursor == null){
                    Toast.makeText(MainActivity.this, "로그인 중 문제가 발생하였습니다. 관리자에게 문의하세요.", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(cursor.moveToNext()) {
                        int cnt = cursor.getInt(0);
                        if (cnt == 0) {
                            *//* id, pw로 DB검색 결과가 존재하지 않는 경우 *//*
                            Toast.makeText(MainActivity.this, "아이디 또는 비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                        } else {
                            *//* 로그인이 정상적으로 된 경우 메인 화면으로 이동한다. *//*
                            //Toast.makeText(MainActivity.this, "로그인 완료.", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                            intent.putExtra("id", id);
                            startActivity(intent);
                        }
                    }
                }
            }
        });*/
    }
}
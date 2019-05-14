package org.techtown.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1Clicked(View v) {
//        Toast.makeText(getApplicationContext(),"시작 버튼이 눌렸어요!",Toast.LENGTH_LONG).show(); // 잠깐 텍스트 나왔다가 사라지기
        Intent myIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com")); // 의도를 담아서 실행
        startActivity(myIntent);
    }
    public void onButton2Clicked(View v) {
//        Toast.makeText(getApplicationContext(),"시작 버튼이 눌렸어요!",Toast.LENGTH_LONG).show();
        Intent myIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-5001-6421"));
        startActivity(myIntent);
    }
    public void onButton3Clicked(View v) {
//        Toast.makeText(getApplicationContext(),"시작 버튼이 눌렸어요!",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(intent);
    }
}

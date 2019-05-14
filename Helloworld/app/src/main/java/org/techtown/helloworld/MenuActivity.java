package org.techtown.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    protected void onBackButtonClicked(View v) {
        Toast.makeText(getApplicationContext(),"돌아가기버튼을 눌렀어요!",Toast.LENGTH_LONG).show();
        finish();
    }
}

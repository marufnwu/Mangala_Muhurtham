package com.mangala.muhurtham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.mangala.muhurtham.Common.Paperdb;
import com.mangala.muhurtham.Models.Login;
import com.mangala.muhurtham.Models.User;

import io.paperdb.Paper;

public class SplashActivity extends AppCompatActivity {

    private User login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Paper.init(this);

    }


    @Override
    protected void onStart() {
        super.onStart();
        login = Paper.book().read(Paperdb.user, null);

        if(login!=null){
            if (login.getStatus()==1 && login.getMemberData().getMemberId()!=null){
                Log.d("MemberId", login.getMemberData().getMemberId()+"");
                startActivity(new Intent(SplashActivity.this, MainActivity.class));

            }else {
                Toast.makeText(this, "Not Logged", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
        }else {
            Toast.makeText(this, "Not Logged", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        }
        finish();


    }
}
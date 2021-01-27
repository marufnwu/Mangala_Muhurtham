package com.mangala.muhurtham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mangala.muhurtham.Common.Paperdb;
import com.mangala.muhurtham.Common.WaitingDialog;
import com.mangala.muhurtham.Models.Login;
import com.mangala.muhurtham.Models.Profile;
import com.mangala.muhurtham.Models.User;
import com.mangala.muhurtham.Retrofit.IRetrofitApiCall;
import com.mangala.muhurtham.Retrofit.RetrofitClient;

import io.paperdb.Paper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.mangala.muhurtham.Common.Paperdb.login;

public class LoginActivity extends AppCompatActivity {
    TextView txt_newAcc,txt_forgotPass;
    EditText edt_email, edt_password;
    Button btn_login;
    WaitingDialog waitingDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Bundle bundle = getIntent().getExtras();

        waitingDialog = new WaitingDialog(this, false);
        initView();

        if(bundle!=null && bundle.getString("email")!=null && bundle.getString("pass")!=null){
            edt_email.setText(bundle.getString("email"));
            edt_password.setText(bundle.getString("pass"));
            login();
        }

    }

    private void initView() {
        txt_newAcc = findViewById(R.id.txt_newAcc);
        edt_email = findViewById(R.id.edt_email);
        edt_password = findViewById(R.id.edt_password);
        txt_forgotPass = findViewById(R.id.txt_forgotPass);
        btn_login = findViewById(R.id.btn_login);

        txt_newAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        txt_forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RecoverActivity.class));
            }
        });
    }

    private void login() {
        String email = edt_email.getText().toString().trim();
        String pass = edt_password.getText().toString().trim();

        if(email.isEmpty()){
            edt_email.setError("Please Enter Email");
            return;
        }

        if(pass.isEmpty()){
            edt_password.setError("Enter Password");
            return;
        }

        waitingDialog.show();

        RetrofitClient.getRetrofit().create(IRetrofitApiCall.class)
                .login(email, pass)
                .enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {

                        if (response.isSuccessful() && response.body()!=null){
                            User user = response.body();


                            if(user.getStatus() ==1 ){
                                Paper.book().write(Paperdb.user, user);

                                if(user.getMemberData().getMemberId()!=null){
                                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                                    finish();
                                }


                            }else {
                                waitingDialog.hide();

                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        waitingDialog.hide();
                        Log.d("RetrifitError", t.getMessage());
                        Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

    }
}
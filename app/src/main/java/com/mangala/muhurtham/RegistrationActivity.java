package com.mangala.muhurtham;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.mangala.muhurtham.Common.Paperdb;
import com.mangala.muhurtham.Common.WaitingDialog;
import com.mangala.muhurtham.Models.Login;
import com.mangala.muhurtham.Retrofit.IRetrofitApiCall;
import com.mangala.muhurtham.Retrofit.RetrofitClient;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import io.paperdb.Paper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistrationActivity extends AppCompatActivity {

    EditText edt_firstName,
            edt_lastName,
            edt_email,
            edt_phone,
            edt_password,
            edt_password1;

    RadioGroup rdioGrp_gender;
    TextView txt_behalf, txt_birthDate;
    Button btn_registration;
    String gender = null;
    private IRetrofitApiCall retrofit;
    WaitingDialog waitingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Paper.init(this);
        initView();
        waitingDialog = new WaitingDialog(RegistrationActivity.this, false);
        retrofit = RetrofitClient.getRetrofit().create(IRetrofitApiCall.class);


    }

    private void initView() {

        edt_firstName = findViewById(R.id.edt_firstName);
        edt_lastName = findViewById(R.id.edt_lastName);
        edt_email = findViewById(R.id.edt_email);
        edt_phone = findViewById(R.id.edt_phone);
        edt_password = findViewById(R.id.edt_password);
        edt_password1 = findViewById(R.id.edt_password1);

        rdioGrp_gender = findViewById(R.id.rdioGrp_gender);
        txt_behalf = findViewById(R.id.txt_behalf);
        txt_birthDate = findViewById(R.id.txt_birthDate);

        btn_registration = findViewById(R.id.btn_registration);


        btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateForm();
            }
        });

        edt_password1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String pass = edt_password.getText().toString().trim();
                String pass1 = edt_password1.getText().toString().trim();

                if(pass.length()>5){
                    if (pass.equals(pass1)){
                        edt_password1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.success, 0);
                    }else {
                        edt_password1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.error, 0);
                    }
                }else {
                    edt_password1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.error, 0);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        txt_birthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar now = Calendar.getInstance();
                int year = now.get(Calendar.YEAR);
                int month = now.get(Calendar.MONTH)+1; //Zero based
                int day = now.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(RegistrationActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String bdate = year+"-"+month+"-"+dayOfMonth;
                        txt_birthDate.setText(bdate);
                    }
                }, year, month, day);

                datePickerDialog.setTitle("Select Birthday");
                datePickerDialog.show();
            }
        });

        rdioGrp_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rdioBtn_male){
                    gender = "Male";
                }else if(checkedId == R.id.rdioBtn_female){
                    gender = "Female";
                }if(checkedId == R.id.rdioBtn_others){
                    gender = "Others";
                }
            }
        });

    }

    private void validateForm() {
        String firstName = edt_firstName.getText().toString().trim();
        String lastName = edt_lastName.getText().toString().trim();
        String email = edt_email.getText().toString().trim();
        String phone = edt_phone.getText().toString().trim();
        String password = edt_password.getText().toString().trim();
        String password1 = edt_password1.getText().toString().trim();

        String bdate = txt_birthDate.getText().toString().trim();


        if(firstName.isEmpty()){
           edt_firstName.setError("First Name Is Required");
           return;
        }
        if(lastName.isEmpty()){
           edt_lastName.setError("Last Name Is Required");
            return;

        }
        if(email.isEmpty()){
           edt_email.setError("Email Is Required");
            return;

        }
        if(phone.isEmpty()){
           edt_phone.setError("Phone num Is Required");
            return;

        }

        if (gender==null){
            Toast.makeText(this, "Select Gender", Toast.LENGTH_SHORT).show();
            return;
        }

        if(password.isEmpty()){
           edt_phone.setError("First Name Is Required");
            return;

        }

        if(password.length()<6){
            edt_password.setError("Password not less than 6 char");
            return;

        }

        if (!password.equals(password1)){
            Toast.makeText(this, "Password not matched", Toast.LENGTH_SHORT).show();
            return;

        }

        waitingDialog.show();

        retrofit.registration(
                firstName,
                lastName,
                gender,
                email,
                bdate,
                phone,
                "Self",
                password
        ).enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                waitingDialog.hide();
                if (response.isSuccessful() && response.body()!=null){
                    Login login = response.body();
                    Toast.makeText(RegistrationActivity.this, login.getMessage(), Toast.LENGTH_SHORT).show();
                    if (login.getStatus()==1){
                        //success
                       Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                       Bundle bundle = new Bundle();
                       bundle.putString("email", email);
                       bundle.putString("pass", password);
                       intent.putExtras(bundle);

                        startActivity(intent);
                        finish();
                    }
                }
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                waitingDialog.hide();
                Toast.makeText(RegistrationActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });




    }
}
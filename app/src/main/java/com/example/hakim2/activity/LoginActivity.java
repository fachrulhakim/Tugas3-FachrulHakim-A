package com.example.hakim2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hakim2.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);

        login.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (password.getText().toString().equals("hakim1")){
                    login_sukses();
                }else{
                    Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void login_sukses(){
            String user_login = username.getText().toString();
            Intent i = new Intent(this, MainActivity.class);
            //kirim usernamenya ke tampilan utama
            i.putExtra("USERNAME", "FachrulHakim");
            startActivity(i);
        }
}
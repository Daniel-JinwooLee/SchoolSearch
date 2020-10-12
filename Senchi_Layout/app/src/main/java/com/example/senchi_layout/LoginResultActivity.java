package com.example.senchi_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText email_input = findViewById(R.id.myemail);
        final EditText password_input = findViewById(R.id.mypassword);

        String email = email_input.getText().toString();
        String password = password_input.getText().toString();
        Button loginButton = findViewById(R.id.login_button);
        Button facebookLoginButton = findViewById(R.id.login_with_facebook_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = email_input.getText().toString();
                String password = password_input.getText().toString();
            }
        });

    }
}
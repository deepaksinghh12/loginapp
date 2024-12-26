package com.example.d22emccs025.login_page;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    // Hardcoded username and password
    private final String USERNAME = "admin";
    private final String PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText usernameInput = findViewById(R.id.usernameInput);
        EditText passwordInput = findViewById(R.id.passwordInput);
        Button loginButton = findViewById(R.id.loginButton);
        TextView resultText = findViewById(R.id.resultText);

        // Handle login button click
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredUsername = usernameInput.getText().toString();
                String enteredPassword = passwordInput.getText().toString();

                if (enteredUsername.equals(USERNAME) && enteredPassword.equals(PASSWORD)) {
                    // Login successful
                    resultText.setText("User is verified");
                } else {
                    // Login failed
                    resultText.setText("User not verified");
                }
            }
        });
    }
}

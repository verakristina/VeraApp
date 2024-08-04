package com.example.veraapp;

import android.os.Bundle;
import android.widget.TextView;
import com.example.bankingapp.R;
import com.example.bankingapp.models.User;
import com.example.bankingapp.utils.BaseActivity;

public class ProfileActivity extends BaseActivity {
    private TextView nameTextView;
    private TextView phoneTextView;
    private TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupViews();
    }

    @Override
    protected void setupViews() {
        nameTextView = findViewById(R.id.nameTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        emailTextView = findViewById(R.id.emailTextView);

        // Example user
        User user = new User("Vera Kristina", "08937777373", "verakristinaa.com");

        nameTextView.setText(user.getName());
        phoneTextView.setText(user.getPhone());
        emailTextView.setText(user.getEmail());
    }
}

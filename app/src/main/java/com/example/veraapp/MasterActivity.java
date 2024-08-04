package com.example.veraapp;

import android.os.Bundle;
import android.widget.TextView;

import com.example.veraapp.models.User;
import com.example.veraapp.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MasterActivity extends BaseActivity {

    private TextView masterInfo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        setupViews();
    }

    @Override
    protected void setupViews() {
        masterInfo = findViewById(R.id.masterInfo);

        List<User> userList = getUsers();
        StringBuilder info = new StringBuilder();

        for (User user : userList) {
            info.append("Name: ").append(user.getName()).append("\n")
                    .append("Email: ").append(user.getEmail()).append("\n")
                    .append("Phone: ").append(user.getPhone()).append("\n\n");
        }

        masterInfo.setText(info.toString());
    }

    private List<User> getUsers() {
        // Return a list of dummy users for demonstration
        List<User> users = new ArrayList<>();
        users.add(new User("Vera", "vera@example.com", "4342323232"));
        users.add(new User("Kristina", "kristina@example.com", "288429942"));
        users.add(new User("Unsia", "unsia@example.com", "083666388283"));
        return users;
    }
}

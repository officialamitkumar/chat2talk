package com.example.chat2talk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chat2talk.databinding.ActivityChatBinding;

public class chatActivity extends AppCompatActivity {

    ActivityChatBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
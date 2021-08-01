package com.example.nearme.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.nearme.R;
import com.example.nearme.databinding.ActivityFogetBinding;

public class FogetActivity extends AppCompatActivity {

    private ActivityFogetBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFogetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(view->{
            onBackPressed();
        });
    }
}
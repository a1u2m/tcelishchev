package com.example.developerslife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.developerslife.adapters.GifFragmentsAdapter;
import com.example.developerslife.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.viewPager.setOffscreenPageLimit(3);
        binding.viewPager.setUserInputEnabled(false);
        binding.viewPager.setAdapter(new GifFragmentsAdapter(this));
        String[] sections = new String[]{getString(R.string.section_latest), getString(R.string.section_top), getString(R.string.section_hot)};
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, true, false, (tab, position) -> tab.setText(sections[position])).attach();
    }
}
package com.example.developerslife.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.developerslife.fragments.GifStateFragment;
import com.example.developerslife.models.GifType;

public class GifFragmentsAdapter extends FragmentStateAdapter {
    public GifFragmentsAdapter(FragmentActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return GifStateFragment.newInstance(GifType.LATEST);
            case 1:
                return GifStateFragment.newInstance(GifType.TOP);
            default:
                return GifStateFragment.newInstance(GifType.HOT); //не работает, на сайте так же
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
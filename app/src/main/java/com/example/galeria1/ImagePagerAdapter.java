package com.example.galeria1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ImagePagerAdapter extends FragmentPagerAdapter {

    private String[] imageUrls;

    public ImagePagerAdapter(FragmentManager fm, String[] imageUrls) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.imageUrls = imageUrls;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return ImageFragment.newInstance(imageUrls[position]);
    }

    @Override
    public int getCount() {
        return imageUrls.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Image " + (position + 1);
    }
}
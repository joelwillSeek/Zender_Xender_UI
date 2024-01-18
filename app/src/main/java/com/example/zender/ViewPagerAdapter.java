package com.example.zender;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.zender.fragments.History;
import com.example.zender.fragments.app;
import com.example.zender.fragments.download;
import com.example.zender.fragments.file;
import com.example.zender.fragments.gif;
import com.example.zender.fragments.music;
import com.example.zender.fragments.photo;
import com.example.zender.fragments.video;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new download();
            case  2:
                return new app();
            case 3:
                return new photo();
            case 4:
                return new music();
            case 5:
                return new video();
            case 6:
                return new gif();
            case 7:
                return new file();
            default:
                return new History();
        }
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}

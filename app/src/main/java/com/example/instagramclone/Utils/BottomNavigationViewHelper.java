package com.example.instagramclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.instagramclone.Home.HomeActivity;
import com.example.instagramclone.Likes.LikesActivity;
import com.example.instagramclone.Profile.ProfileActivity;
import com.example.instagramclone.R;
import com.example.instagramclone.Search.SearchActivity;
import com.example.instagramclone.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Abdelrahman M. Hsn on 6/30/2019.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(true);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);

    }


    public static void enableNavigation(final Context context, BottomNavigationViewEx bottomNavigationViewEx) {

        bottomNavigationViewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.ic_house:
                        context.startActivity(new Intent(context,HomeActivity.class));//ACTIVITY_NUM = 0
                        break;

                    case R.id.ic_search:
                        context.startActivity(new Intent(context, SearchActivity.class));//ACTIVITY_NUM = 1
                        break;

                    case R.id.ic_circle:
                        context.startActivity(new Intent(context, ShareActivity.class));//ACTIVITY_NUM = 2
                        break;

                    case R.id.ic_alert:
                        context.startActivity(new Intent(context, LikesActivity.class));//ACTIVITY_NUM = 3
                        break;

                    case R.id.ic_android:
                        context.startActivity(new Intent(context, ProfileActivity.class));//ACTIVITY_NUM = 4
                        break;
                }
                return false;
            }
        });

    }
}

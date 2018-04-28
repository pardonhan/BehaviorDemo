package com.hanfl.behavior;

import android.Manifest;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.hanfl.behavior.base.BaseActivity;
import com.hanfl.behavior.ui.AnimationActivity;
import com.hanfl.behavior.ui.JiecaoVideoActivity;
import com.hanfl.behavior.ui.PlayVideoActivity;
import com.hanfl.behavior.ui.VideoViewActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    private static final String[] NECESSARY_PERMISSION = {
            Manifest.permission.ACCESS_FINE_LOCATION
            , Manifest.permission.ACCESS_COARSE_LOCATION
            , Manifest.permission.CAMERA
            , Manifest.permission.READ_EXTERNAL_STORAGE
            , Manifest.permission.RECORD_AUDIO
            , Manifest.permission.WRITE_EXTERNAL_STORAGE};
    private static final String TAG = MainActivity.class.getSimpleName();

    private BottomSheetBehavior mBottomSheetBehavior;

    @BindView(R.id.btn_video)
    Button btnVideo;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @Override
    protected int attachLayoutRes() {
        return R.layout.navigation_layout;
    }

    @Override
    protected void initViews() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);
        findViewById(R.id.btn_bottom_sheet_control).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_bottom_sheet_control) {
            mBottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.tab_layout));
            if (mBottomSheetBehavior.getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
            } else if (mBottomSheetBehavior.getState() == BottomSheetBehavior.STATE_HIDDEN) {
                mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        }
    }


    @OnClick(R.id.btn_video)
    public void playVideo() {
        startActivity(new Intent(MainActivity.this, PlayVideoActivity.class));
    }

    @OnClick(R.id.btn_video_view)
    public void videoView() {
        startActivity(new Intent(MainActivity.this, VideoViewActivity.class));
    }

    @OnClick(R.id.btn_jiecao)
    public void jiecao() {
        startActivity(new Intent(MainActivity.this, JiecaoVideoActivity.class));
    }

    @OnClick(R.id.btn_fourth)
    public void onFourthClick() {
        startActivity(new Intent(MainActivity.this, AnimationActivity.class));
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_camera:

                break;
            case R.id.nav_gallery:
                break;
            case R.id.nav_slideshow:
                break;
            case R.id.nav_manage:
                break;
            case R.id.nav_share:
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
}

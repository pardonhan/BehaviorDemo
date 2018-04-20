package com.hanfl.behavior;

import android.Manifest;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.hanfl.behavior.ui.JiecaoVideoActivity;
import com.hanfl.behavior.ui.PlayVideoActivity;
import com.hanfl.behavior.ui.VideoViewActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String[] NECESSARY_PERMISSION = {
            Manifest.permission.WRITE_EXTERNAL_STORAGE};

    private BottomSheetBehavior mBottomSheetBehavior;

    @BindView(R.id.btn_video)
    Button btnVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        onPermissionGranted();
    }

    private void initActivity() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.btn_bottom_sheet_control).setOnClickListener(this);
        // 拿到这个tab_layout对应的BottomSheetBehavior
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

    @AfterPermissionGranted(100)
    public void onPermissionGranted() {
        if (hasNecessaryPermission()) {
            initActivity();
        } else {
            EasyPermissions.requestPermissions(
                    this,
                    "邦邦医咖需要申请一些权限,取消可能导致程序不可用",
                    100,
                    NECESSARY_PERMISSION);
        }

    }

    private boolean hasNecessaryPermission() {
        return EasyPermissions.hasPermissions(this, NECESSARY_PERMISSION);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //PermissionsManager.getInstance().notifyPermissionsChange(permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @OnClick(R.id.btn_video)
    public void playVideo(){
        startActivity(new Intent(MainActivity.this, PlayVideoActivity.class));
    }

    @OnClick(R.id.btn_video_view)
    public void videoView(){
        startActivity(new Intent(MainActivity.this, VideoViewActivity.class));
    }
    @OnClick(R.id.btn_jiecao)
    public void jiecao(){
        startActivity(new Intent(MainActivity.this, JiecaoVideoActivity.class));
    }
}

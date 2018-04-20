package com.hanfl.behavior.ui;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import com.hanfl.behavior.R;

public class VideoViewActivity extends AppCompatActivity {
    private VideoView video;
    private EditText et;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        initView();
    }

    private void initView() {
        et = (EditText) findViewById(R.id.et1);
        video = (VideoView) findViewById(R.id.video);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = Environment.getExternalStorageDirectory().getPath() + "/" + "DCIM/Video/V80410-135455.mp4";//获取视频路径
                Uri uri = Uri.parse(path);//将路径转换成uri
                video.setVideoURI(uri);//为视频播放器设置视频路径
                video.setMediaController(new MediaController(VideoViewActivity.this));//显示控制栏
                video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        video.start();//开始播放视频
                    }
                });
            }
        });
    }
}

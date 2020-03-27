package com.android.train.androidlasttrainesfand98;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        String url = "https://as7.cdn.asset.aparat.com/aparat-video/3ba07409f6dc27891d860ced2c0fec7520353177-480p__57288.mp4";
        VideoView vv = findViewById(R.id.vv);
        vv.setVideoURI(Uri.parse(url));
        vv.setMediaController(new MediaController(VideoActivity.this));
        vv.start();
    }
}

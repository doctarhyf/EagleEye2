package com.example.franvanna.eagleeye2;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class ActivityMain extends AppCompatActivity {

    private VideoView videoIntro;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        videoIntro = findViewById(R.id.vidIntro);
        uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.ceni);
        playVid();

        videoIntro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                skipVid();
            }
        });




    }

    public void skipVid(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onSkipVid(View view) {

        skipVid();
    }

    private void playVid() {


        videoIntro.setVideoURI(uri);
        videoIntro.start();
    }
}

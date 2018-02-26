package com.example.franvanna.eagleeye2;

import android.content.Context;
import android.content.Intent;
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




    }

    public void onSkipVid(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void playVid() {


        videoIntro.setVideoURI(uri);
        videoIntro.start();
    }
}

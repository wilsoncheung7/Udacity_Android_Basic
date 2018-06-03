package com.wewsun.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        TextView songView = findViewById(R.id.song);
        String musicName = songView.getText().toString();
        TextView artistView = findViewById(R.id.artist);
        String artist = artistView.getText().toString();
        Music music = new Music(musicName,artist);
        songView.setText(music.getmMusicName());
        artistView.setText(music.getmArtist());
        Button backToMainScreen = findViewById(R.id.back);
        backToMainScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MusicActivity.this,MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}

package com.wewsun.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Music> music = new ArrayList<>();

        MusicAdapter adapter = new MusicAdapter(this,music);
        music.add(new Music("song","artist"));
        music.add(new Music("music","artist"));
        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                    startActivity(musicIntent);
            }
        });
    }
}

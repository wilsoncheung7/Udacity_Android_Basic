package com.wewsun.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter(Activity context, List<Music> Music){
        super(context,0,Music);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_music,parent,false);
        }
        Music currentMusicAdapter = getItem(position);
        TextView musicView = (TextView) listItemView.findViewById(R.id.music_text_view);
        musicView.setText(currentMusicAdapter.getmMusicName());
        TextView artistView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistView.setText(currentMusicAdapter.getmArtist());
        return listItemView;
    }
}

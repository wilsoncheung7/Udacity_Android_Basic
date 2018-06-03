package com.wewsun.musicalstructureapp;

public class Music {

    private String mSongName;
    private String mArtist;

    public Music(String musicName, String artist){
        mSongName=musicName;
        mArtist=artist;
    }

    public String getmMusicName() {
        return mSongName;
    }

    public String getmArtist() {
        return mArtist;
    }
}

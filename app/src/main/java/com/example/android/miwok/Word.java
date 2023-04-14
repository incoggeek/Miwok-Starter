package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    private int mImage;
    private int mAudio;

    //Methods
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImage() {
        return mImage;
    }

    public int getmAudio() {
        return mAudio;
    }

    //Constructor
    public Word(String defaultTranslation, String miwokTranslation, int image,int audio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = image;
        mAudio = audio;
    }

    //Constructor for non-image classes
    public Word(String defaultTranslation, String miwokTranslation, int audio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audio;
    }
}

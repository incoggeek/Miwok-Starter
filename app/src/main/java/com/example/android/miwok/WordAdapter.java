package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> wordArrayList) {
        super(context,0, wordArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView;

        if(convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.miwok_layout, parent, false);
        }
        else {
            listItemView = convertView;
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView englishTextView = listItemView.findViewById(R.id.english);

        englishTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getmImage());

        return listItemView;

    }

}

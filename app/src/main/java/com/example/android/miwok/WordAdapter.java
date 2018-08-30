package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        if (currentWord != null) {
            ImageView imageResourceId = (ImageView) listItemView.findViewById(R.id.image_view);
            if (imageResourceId != null) {
                if (currentWord.hasImage()) {
                    imageResourceId.setImageResource(currentWord.getImageResourceId());
                    imageResourceId.setVisibility(View.VISIBLE);
                } else {
                    imageResourceId.setVisibility(View.INVISIBLE);
                }
            }

            LinearLayout verticalTextView = (LinearLayout) listItemView.findViewById(R.id.vertical_text_view);
            if (verticalTextView != null) {
                int color = ContextCompat.getColor(getContext(), mColor);
                verticalTextView.setBackgroundColor(color);
            }

            TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
            if (miwokTextView != null) {
                miwokTextView.setText(currentWord.getMiwokTranslation());
            }

            TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
            if (defaultTextView != null) {
                defaultTextView.setText(currentWord.getDefaultTranslation());
            }
        }
        return listItemView;
    }
}

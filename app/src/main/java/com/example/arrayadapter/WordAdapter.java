package com.example.arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, @NonNull List<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    View list = convertView;
    if(list==null){
        list= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
    }
    Word curr = getItem(position);
        TextView text1 = (TextView) list.findViewById(R.id.name);
        text1.setText(curr.getName());
        TextView text2 = (TextView) list.findViewById(R.id.age);
        text2.setText(Integer.toString(curr.getAge()));
        return list;
    }
}

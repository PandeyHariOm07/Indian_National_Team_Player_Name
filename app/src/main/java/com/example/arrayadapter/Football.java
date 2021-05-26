package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Football extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.Football_Team);
        setContentView(R.layout.common);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Sunil Chhetri",36));
        words.add(new Word("Subhasish Roy",34));
        words.add(new Word("Balwant Singh",34));
        words.add(new Word("Anas",34));
        words.add(new Word("Adil Khan",32));
        words.add(new Word("Rahul Bheke",30));
        words.add(new Word("Ashutosh Mehta",30));
        words.add(new Word("Gurpreet Sandhu",29));
        words.add(new Word("Jackichand singh",29));
        words.add(new Word("Mandar Rao",29));
        words.add(new Word("Amrinder Singh",27));
        words.add(new Word("Sandesh Singh",27));
        words.add(new Word("Pritam Kotal",27));
        words.add(new Word("Halicharan",27));
        words.add(new Word("Glan Martins",26));
        words.add(new Word("Brandon",26));
        words.add(new Word("Bipin Singh",26));
        words.add(new Word("Subhashish Bose",25));
        words.add(new Word("Nikhil Poojari",25));
        words.add(new Word("Manvir Singh",25));
        words.add(new Word("Kamaljit Singh",25));

        WordAdapter adapter =  new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.common);
        listView.setAdapter(adapter);
    }
}
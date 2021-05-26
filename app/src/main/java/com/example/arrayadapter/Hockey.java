package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hockey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.Hockey_Team);
        setContentView(R.layout.common);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(" Manpreet Singh",36));
        words.add(new Word("S.V. Sunil",34));
        words.add(new Word("Rupinder Pal Singh",34));
        words.add(new Word("P.R. Sreejesh",34));
        words.add(new Word("Kothajit Khadangbam",32));
        words.add(new Word("Mandeep Singh",30));
        words.add(new Word("Birendra Lakra",30));
        words.add(new Word("Chinglensana Kangujam",29));
        words.add(new Word(" Akashdeep Singh",29));
        words.add(new Word("Ramandeep Singh",29));
        words.add(new Word("Chinglensana Kangujam",27));
        words.add(new Word("Amit Rohidas",27));
        words.add(new Word("Harmanpreet Singh",27));
        words.add(new Word("Surender Kumar",27));
        words.add(new Word("Lalit Upadhya",26));
        words.add(new Word("Gurinder Singh",26));
        words.add(new Word("Simranjeet Singh",26));
        words.add(new Word("Gurjant Singh",25));
        words.add(new Word("Mariana Kujur",25));
        words.add(new Word("Bichu Devi Kharibam",25));
        words.add(new Word("Prashant Kumar Chauhan",25));

        WordAdapter adapter =  new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.common);
        listView.setAdapter(adapter);
    }
}
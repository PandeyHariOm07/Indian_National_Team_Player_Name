package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CricketTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.Cricket_Team);
        setContentView(R.layout.common);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Shikhar Dhawan",32));
        words.add(new Word("Rohit Sharma",33));
        words.add(new Word("Virat Kohli",34));
        words.add(new Word("Surya Kumar Yadav",30));
        words.add(new Word("Shreyas Iyar",27));
        words.add(new Word("Manish Pandey",28));
        words.add(new Word("Rishabh Pant",23));
        words.add(new Word("Hardik Pandya",28));
        words.add(new Word("Ravindra Jadeja",30));
        words.add(new Word("Prithvi Shaw",22));
        words.add(new Word("Krunal Pandya",32));
        words.add(new Word("Sanju Samson",32));
        words.add(new Word("Ashwin",34));
        words.add(new Word("MS Dhoni",38));
        words.add(new Word("Chahal",28));
        words.add(new Word("kuldeep Yadav",29));
        words.add(new Word("Mohd Siraj",27));
        words.add(new Word("Bhuvneshwar Kumar",32));
        words.add(new Word("Mohd Shami",31));
        words.add(new Word("Umesh Yadav",33));
        words.add(new Word("Jasprit Bumrah",29));

        WordAdapter adapter =  new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.common);
        listView.setAdapter(adapter);
    }

}
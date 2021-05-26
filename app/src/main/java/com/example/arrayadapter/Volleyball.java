package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Volleyball extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.Vollyball_Team);
        setContentView(R.layout.common);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("G K S Ammal Akhin",36));
        words.add(new Word("Amit Balwan Singh",34));
        words.add(new Word("Ranjit Singh Ranjit Singh",34));
        words.add(new Word("Gagan Kumar Kumar",34));
        words.add(new Word("Kamlesh Khatik",32));
        words.add(new Word("Vinit Kumar Vinit Kumar c",30));
        words.add(new Word("Ajithlal Chandran\t",30));
        words.add(new Word("Sinha Deepesh Kumar",29));
        words.add(new Word("Midhun Kumar Balasubramaniayn",29));
        words.add(new Word("Jerome Vinith Charles",29));
        words.add(new Word("Ukkrapandian Mohan",27));
        words.add(new Word("Shon Thanghalathil John",27));
        words.add(new Word("Ashwal Rai",27));
        words.add(new Word("Karthik Ashok",27));
        words.add(new Word("Ukkrapandian Mohan ",26));
        words.add(new Word("Jerome Vinith Charles",26));
        words.add(new Word("Prabagaran",26));
        words.add(new Word("Jerome Vinith Charles",25));
        words.add(new Word("Rohit Kumar",25));
        words.add(new Word("Kamlesh Dinesh Khatale",25));
        words.add(new Word("Ajithlal Chandran",25));

        WordAdapter adapter =  new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.common);
        listView.setAdapter(adapter);
    }
}
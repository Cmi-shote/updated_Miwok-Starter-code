package com.example.android.miwok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class NumbersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.words_list)

        val words = ArrayList<Word>()
        words.add(Word("one","lutti"))
        words.add(Word("two", "otiiko"))
        words.add(Word("three", "tolookosu"))
        words.add(Word("four", "oyyisa"))
        words.add(Word("five", "massokka"))
        words.add(Word("six", "temmokka"))
        words.add(Word("seven", "kenekaku"))
        words.add(Word("eight", "kawinta"))
        words.add(Word("nine", "wo'e"))
        words.add(Word("ten", "na'aacha"))

        val itemsAdapter = WordAdapter(this, words)

        val listView: ListView = findViewById(R.id.list)

        listView.adapter = itemsAdapter

    }

}


package com.example.android.miwok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class NumbersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.words_list)

        val words = ArrayList<Word>()
        words.add(Word("one","lutti", R.drawable.number_one))
        words.add(Word("two", "otiiko", R.drawable.number_two))
        words.add(Word("three", "tolookosu", R.drawable.number_three))
        words.add(Word("four", "oyyisa", R.drawable.number_four))
        words.add(Word("five", "massokka", R.drawable.number_five))
        words.add(Word("six", "temmokka", R.drawable.number_six))
        words.add(Word("seven", "kenekaku", R.drawable.number_seven))
        words.add(Word("eight", "kawinta", R.drawable.number_eight))
        words.add(Word("nine", "wo'e", R.drawable.number_nine))
        words.add(Word("ten", "na'aacha", R.drawable.number_ten))

        val itemsAdapter = WordAdapter(this, words)

        val listView: ListView = findViewById(R.id.list)

        listView.adapter = itemsAdapter

    }

}


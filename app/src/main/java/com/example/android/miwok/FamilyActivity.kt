package com.example.android.miwok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class FamilyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.words_list)


        val words = ArrayList<Word>()
        words.add(Word("father","әpә", R.drawable.family_father))
        words.add(Word("mother", "әṭa", R.drawable.family_mother))
        words.add(Word("son", "angsi", R.drawable.family_son))
        words.add(Word("daughter", "tune", R.drawable.family_daughter))
        words.add(Word("older brother", "taachi", R.drawable.family_older_brother))
        words.add(Word("younger brother", "chalitti", R.drawable.family_younger_brother))
        words.add(Word("older sister", "teṭe", R.drawable.family_older_sister))
        words.add(Word("younger sister", "kolliti", R.drawable.family_younger_sister))
        words.add(Word("grandmother", "ama", R.drawable.family_grandmother))
        words.add(Word("grandfather", "paapa", R.drawable.family_grandfather))

        val itemsAdapter = WordAdapter(this, words)

        val listView: ListView = findViewById(R.id.list)

        listView.adapter = itemsAdapter

    }
}
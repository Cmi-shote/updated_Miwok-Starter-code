package com.example.android.miwok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class FamilyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.words_list)


        val words = ArrayList<Word>()
        words.add(Word("father","әpә"))
        words.add(Word("mother", "әṭa"))
        words.add(Word("son", "angsi"))
        words.add(Word("daughter", "tune"))
        words.add(Word("older brother", "taachi"))
        words.add(Word("younger brother", "chalitti"))
        words.add(Word("older sister", "teṭe"))
        words.add(Word("younger sister", "kolliti"))
        words.add(Word("grandmother", "ama"))
        words.add(Word("grandfather", "paapa"))

        val itemsAdapter = WordAdapter(this, words)

        val listView: ListView = findViewById(R.id.list)

        listView.adapter = itemsAdapter

    }
}
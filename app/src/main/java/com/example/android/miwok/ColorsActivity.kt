package com.example.android.miwok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ColorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.words_list)

        val words = ArrayList<Word>()
        words.add(Word("red","wetetti"))
        words.add(Word("green", "chokokki"))
        words.add(Word("brown", "takaakki"))
        words.add(Word("gray", "topoppi"))
        words.add(Word("black", "kululli"))
        words.add(Word("white", "kelelli"))
        words.add(Word("dusty yellow", "ṭopiisә"))
        words.add(Word("mustard yellow", "chiwiiṭә"))

        val itemsAdapter = WordAdapter(this, words)

        val listView: ListView = findViewById(R.id.list)

        listView.adapter = itemsAdapter
    }
}
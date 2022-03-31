
package com.example.android.miwok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android.miwok.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main)
    }

    fun openNumbersList(view: View) {
        val intent = Intent(this, NumbersActivity::class.java)
        startActivity(intent)
    }

    fun openFamily(view: View) {
        val intent = Intent(this, FamilyActivity::class.java)
        startActivity(intent)
    }

    fun ColorsList(view: View) {
        val intent = Intent(this, ColorsActivity::class.java)
        startActivity(intent)
    }

    fun Phrases(view: View) {
        val intent = Intent(this, PhrasesActivity::class.java)
        startActivity(intent)
    }

}
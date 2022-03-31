package com.example.android.miwok

import android.widget.TextView

class Word(defaultTranslation: String, miwokTranslation: String) {

    private var mDefaultTranslation : String = defaultTranslation
    private var mMiwokTranslation : String = miwokTranslation

    fun getDefaultTranslation() : String {
        return mDefaultTranslation
    }

    fun getMiwokTranslation() : String {
        return mMiwokTranslation
    }

}
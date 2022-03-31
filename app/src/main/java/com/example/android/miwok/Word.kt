package com.example.android.miwok

import android.widget.TextView
import kotlin.properties.Delegates

class Word{

    private lateinit var mMiwokTranslation : String
    private lateinit var mDefaultTranslation : String
    private var mImageResourceId = 0

    constructor(defaultTranslation: String, miwokTranslation: String){
        mDefaultTranslation = defaultTranslation
        mMiwokTranslation = miwokTranslation
    }

    constructor(defaultTranslation: String, miwokTranslation: String, imageResourceId : Int){
        mDefaultTranslation = defaultTranslation
        mMiwokTranslation = miwokTranslation
        mImageResourceId = imageResourceId
    }


    fun getDefaultTranslation() : String  {
        return mDefaultTranslation
    }

    fun getMiwokTranslation() : String {
        return mMiwokTranslation
    }

    fun getImageResourceId() : Int{
        return mImageResourceId
    }

}
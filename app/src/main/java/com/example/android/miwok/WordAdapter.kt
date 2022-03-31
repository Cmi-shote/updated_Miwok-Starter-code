package com.example.android.miwok

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


//we create a custom array adapter because the default one only works with a single textview
//creating a custom adapter that inherits from the ArrayAdapter and takes its data source from the custom object Word
class WordAdapter(context: Activity?, words: ArrayList<Word>) :
    ArrayAdapter<Word>(context!!, 0, words) {
    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // the second argument is used when the ArrayAdapter is populating a single TextView.
    // Because this is a custom adapter for two TextViews, the adapter is not
    // going to use this second argument, so it can be any value. Here, we used 0.


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView : View? = convertView
        if(listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                R.layout.list_item, parent, false)
        }

        // Get the Word object located at this position in the list
        val currentWord : Word? = getItem(position)

        // Find the TextView in the list_item.xml layout with the ID version_name
        val miwokTextView : TextView? = listItemView?.findViewById(R.id.miwok_textview)
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView?.text = currentWord?.getMiwokTranslation()

        // Find the TextView in the list_item.xml layout with the ID version_number
        val defaultTextView : TextView? = listItemView?.findViewById(R.id.english_textview)
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView?.text = currentWord?.getDefaultTranslation()


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView!!
    }
}
package com.example.bssastrologyservices.ui.slideshow

import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bssastrologyservices.R

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        val kundlireadingContent = R.string.kundlireading_content
        //value = kundlireadingContent
        //val textView: TextView = root.findViewById(R.id.text_slideshow)
    }
    val text: LiveData<String> = _text
}
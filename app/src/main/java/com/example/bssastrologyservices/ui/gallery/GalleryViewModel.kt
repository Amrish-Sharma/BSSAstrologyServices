package com.example.bssastrologyservices.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Palmistry is very important and famous tool used by ancient people to demystify life "
    }
    val text: LiveData<String> = _text
}
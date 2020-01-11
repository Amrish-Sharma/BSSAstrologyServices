package com.example.bssastrologyservices.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "BSS Astrology Services\n"
        value = "BSS Astrology Services is an astrological service provider based in the city of Noida. With over a decade of experience in the field of Vedic astrology, they specialise in areas like Astrology, Numerology, Palmistry as well as Vastu Shastra so that you can get any and all of the questions that you have in your mind answered. When we embark on a new journey or take a big decision in our lives, it becomes imperative to ask or consult with someone who has a better understanding of life and can help us understand if it will be beneficial for us."
    }
    val text: LiveData<String> = _text
}
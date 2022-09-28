package com.example.shareviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val _mutableLiveData = MutableLiveData<String>("No Text yet")
    var liveData = _mutableLiveData as LiveData<String>

    fun setText(text : String){
        _mutableLiveData.value = text
    }
}
package com.example.kotlinflowtutorial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _languagesData = MutableLiveData<String>()
    val languagesData: LiveData<String> get() = _languagesData

    fun getLanguages() {

    }
}
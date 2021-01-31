package com.example.kotlinflowtutorial

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    lateinit var languagesData: LiveData<String>

    fun getLanguages() {

    }
}
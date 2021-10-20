package com.example.kotlinflowtutorial

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {

    val languagesData: LiveData<String> = getLanguages().asLiveData()

    fun getLanguages(): Flow<String> {
        return flow {
            val languages = listOf(
                "Java",
                "kotlin",
                "php",
                "c++",
                "c#",
                "java script",
                "python"
            )

            for (language in languages) {
                emit(language)
                kotlinx.coroutines.delay(1000L)
            }
        }
    }
}
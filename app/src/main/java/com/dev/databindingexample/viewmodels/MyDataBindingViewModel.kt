package com.dev.databidingexample.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyDataBindingViewModel: ViewModel () {

    val usernameTextLiveData = MutableLiveData<String> ()

    init {
        usernameTextLiveData.value = "Hello This is Priyavrat"
    }
}
package com.furkanekiz.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ACMainViewModel: ViewModel() {

    val userName = MutableLiveData<String>()

    init {
        userName.value = "Frank"
    }
}
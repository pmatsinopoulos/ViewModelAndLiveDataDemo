package com.mixlr.panos.viewmodelandlivedatademo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {
    fun getUserData() {
        viewModelScope.launch {
            //write some code
        }
    }
}
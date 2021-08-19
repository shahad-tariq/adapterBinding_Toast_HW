package com.example.adapterbinding_toast_hw

import androidx.lifecycle.*
import kotlinx.coroutines.flow.debounce

class MainViewModel : ViewModel() {

    var _currentCurrency: MutableLiveData<String> = MutableLiveData<String>()

    var currentCurrency: LiveData<String> = _currentCurrency
        .asFlow()
        .debounce(3000)
        .asLiveData()


}
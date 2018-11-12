package com.example.stanislavkinzl.tabtestupdateddep.feature.feature_comicslist.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.stanislavkinzl.tabtestupdateddep.app.model.Comic

abstract class ComicsViewModel : ViewModel() {

    sealed class State {
        data class FetchMemesSuccess(val comics: List<Comic>) : State()
        object FetchMemesError : State()
    }

    abstract fun state(): LiveData<State>

    abstract fun getComicsApiList()
}
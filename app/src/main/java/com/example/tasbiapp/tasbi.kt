package com.example.tasbiapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class tasbi : ViewModel(){

    private  var Score = 0

    var _livescore = MutableLiveData<Int>()

    fun increase(){
        Score++
        _livescore.postValue(Score)
    }
    fun reset(){
        Score = 0
        _livescore.postValue(Score)
    }
    fun Dcrease(){
        Score--
        _livescore.postValue(Score)
    }
}
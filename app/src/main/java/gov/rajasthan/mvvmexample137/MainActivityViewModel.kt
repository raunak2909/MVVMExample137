package gov.rajasthan.mvvmexample137

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel(){

    var count = 0

    fun incrementCount(){
        count++
    }

    fun getCountValue() : Int{
        return count
    }

}
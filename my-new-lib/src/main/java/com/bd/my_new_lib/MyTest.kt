package com.bd.my_new_lib

import android.util.Log

class MyTest {
    companion object{
        fun printLog(s: String){
            Log.d("MyTest", s)
        }
    }

    fun testMethod(){
        Log.d("MyTest", "I am a test method")
    }
}
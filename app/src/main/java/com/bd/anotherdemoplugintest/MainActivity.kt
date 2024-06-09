package com.bd.anotherdemoplugintest
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bd.anotherdemoplugintest.databinding.ActivityMainBinding
import com.bd.my_new_lib.MyTest

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Set the content view to the root of the binding object
        setContentView(binding.root)
        MyTest.printLog("from main activity")
        val t = MyTest()
        t.testMethod()
    }
}
package com.sarvagya.languagepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nullSafety()
    }

    // Optional
    fun nullSafety(){
        var optional = Optional.of("I'm not null")
        if(optional.isPresent){
            System.out.println("Optional: ${optional.get().length}")
        }
    }

}
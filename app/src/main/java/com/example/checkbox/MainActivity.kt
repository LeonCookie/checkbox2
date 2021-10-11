package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    //vary
    lateinit var mleko: CheckBox
    lateinit var jajka: CheckBox
    lateinit var kawa: CheckBox
    lateinit var button: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)// s
        setContentView(R.layout.activity_main)
    }
}//s
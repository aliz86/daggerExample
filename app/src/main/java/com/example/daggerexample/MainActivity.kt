package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample.testClasses.otherclasses.DTest
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

        @Inject
        lateinit var dTest : DTest

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
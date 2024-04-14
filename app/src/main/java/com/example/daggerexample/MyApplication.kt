package com.example.daggerexample

import android.app.Application
import android.content.res.Configuration
import com.example.daggerexample.di.DaggerApplicationComponent
import com.example.daggerexample.di.DaggerYam

class MyApplication : Application() {

    // Reference to the application graph that is used across the whole app
    val appComponent = DaggerApplicationComponent.create()
    val appComponent2 = DaggerYam.create()

    // Called when the application is starting, before any other application objects have been created.
    override fun onCreate() {
        super.onCreate()
        // Required initialization logic here!
    }

    // Called by the system when the device configuration changes while your component is running.
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }
}
package com.example.daggerexample.di

import com.example.daggerexample.scopes.AppScope
import com.example.daggerexample.testClasses.otherclasses.DTest
import com.example.daggerexample.testClasses.otherclasses.ETest
import com.example.daggerexample.testClasses.otherclasses.FTest
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

// Definition of the Application graph
@Singleton
@Component(modules = [MyFirstDiModule::class])
interface ApplicationComponent {
    fun dTest() : DTest

    fun eTest() : ETest

    fun fTest() : FTest

    fun getRetrofit() : Retrofit
}
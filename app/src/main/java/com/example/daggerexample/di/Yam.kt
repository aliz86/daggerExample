package com.example.daggerexample.di

import com.example.daggerexample.scopes.AppScope
import com.example.daggerexample.testClasses.otherclasses.DTest
import com.example.daggerexample.testClasses.otherclasses.ETest
import dagger.Component
import javax.inject.Singleton

// Definition of the Application graph
@Singleton
@Component(modules = [MyFirstDiModule::class])
interface Yam {
    fun dTest() : DTest

    fun eTest() : ETest
}
package com.example.daggerexample.di

import com.example.daggerexample.scopes.AppScope
import com.example.daggerexample.testClasses.otherclasses.DTest
import com.example.daggerexample.testClasses.otherclasses.ETest
import dagger.Component

// Definition of the Application graph
@Component(modules = [MyFirstDiModule::class])
interface Yam {
    fun dTest() : DTest

    fun eTest() : ETest
}
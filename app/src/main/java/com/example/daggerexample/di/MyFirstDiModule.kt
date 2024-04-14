package com.example.daggerexample.di

import com.example.daggerexample.testClasses.otherclasses.DTest
import com.example.daggerexample.testClasses.otherclasses.ETest
import com.example.daggerexample.testClasses.otherclasses.FTest
import dagger.Module
import dagger.Provides

@Module
class MyFirstDiModule (/*i : Int*/) {

    @Provides
    fun dTest() = DTest()

    @Provides
    fun eTest() = ETest()

    @Provides
    fun fTest() = FTest()


}
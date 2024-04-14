package com.example.daggerexample.di

import com.example.daggerexample.testClasses.otherclasses.DTest
import com.example.daggerexample.testClasses.otherclasses.ETest
import com.example.daggerexample.testClasses.otherclasses.FTest
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit




@Module
class MyFirstDiModule (/*i : Int*/) {

    @Provides
    fun getRetrofit() = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        //.addConverterFactory(GsonConverterFactory.create()) :Must add the dependency to build.gradle
        .build()


    //If I write it like below, every time the DTest object is needed the retrofit object will be recreated because of the getRetrofit()...
    @Provides
    fun dTest() = DTest(getRetrofit().create(Retrofit::class.java))

/*
    @Provides
    fun dTest(retrofit : Retrofit) = DTest(retrofit.create(Retrofit::class.java))
*/

    @Provides
    fun eTest() = ETest()

    @Provides
    fun fTest() = FTest()

}
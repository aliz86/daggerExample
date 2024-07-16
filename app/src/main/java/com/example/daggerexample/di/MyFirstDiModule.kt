package com.example.daggerexample.di

import com.example.daggerexample.retrofit.RetrofitApi
import com.example.daggerexample.scopes.AppScope
import com.example.daggerexample.testClasses.otherclasses.DTest
import com.example.daggerexample.testClasses.otherclasses.ETest
import com.example.daggerexample.testClasses.otherclasses.FTest
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
class MyFirstDiModule (/*i : Int*/) {

    //Dagger will know to use this object for creation of DTest object automatically. Also see the reame.ms file in this project, part "If in a module, two objects have the same dependency"
    @Provides
    fun getRetrofit() = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        //.addConverterFactory(GsonConverterFactory.create()) :Must add the dependency to build.gradle
        .build()


    //If I write it like below, every time the DTest object is needed the retrofit object will be recreated because of the getRetrofit()...
/*
    @Provides
    fun dTest() = DTest(getRetrofit().create(Retrofit::class.java))
*/
    //must be added to the component, too : ApplicationComponent & Yam Component
    @Singleton
    @Provides
    fun dTest(retrofit : Retrofit) = DTest(retrofit.create(RetrofitApi::class.java))

    @Provides
    fun eTest() = ETest()

    @Provides
    fun fTest() = FTest()

}
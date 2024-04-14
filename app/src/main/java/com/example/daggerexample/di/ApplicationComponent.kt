package com.example.daggerexample.di

import dagger.Component

// Definition of the Application graph
@Component(modules = [MyFirstDiModule::class])
interface ApplicationComponent {

}
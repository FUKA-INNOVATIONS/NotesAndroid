package com.example.notesandroid.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

// Modules are used to add bindings to Hilt
// Tells Hilt how to provide instances of different types

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

}
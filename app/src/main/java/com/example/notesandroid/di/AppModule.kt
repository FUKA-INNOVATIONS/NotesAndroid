package com.example.notesandroid.di

import android.content.Context
import androidx.room.Room
import com.example.notesandroid.data.NoteDatabase
import com.example.notesandroid.data.NoteDatabaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Modules are used to add bindings to Hilt
// Tells Hilt how to provide instances of different types

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideNotesDao(noteDatabase: NoteDatabase): NoteDatabaseDao = noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): NoteDatabase
        = Room.databaseBuilder(context, NoteDatabase::class.java, "notes_db").fallbackToDestructiveMigration().build()

}
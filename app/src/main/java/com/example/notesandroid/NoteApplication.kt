package com.example.notesandroid

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


// @HiltAndroidApp
// This gives Hilt access to the entire application
// Creates a dependency container at the top/application level
// Can supply dependencies to any part of the app

// This class must be added to manifest

@HiltAndroidApp
class NoteApplication : Application() {

}
package com.example.torem

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ToRemApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
package com.deepsiam.deepsiamgroups

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.deepsiam.features.groups.entities.DiveActivityEntity
import com.deepsiam.features.groups.entities.DiveActivityServer
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import java.util.HashMap


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
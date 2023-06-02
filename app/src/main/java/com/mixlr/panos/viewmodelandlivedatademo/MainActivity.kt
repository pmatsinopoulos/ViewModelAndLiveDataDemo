package com.mixlr.panos.viewmodelandlivedatademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        Log.i("MyTag", "About to call getUserData() from main activity")
        mainActivityViewModel.getUserData()
        mainActivityViewModel.users.observe(this, Observer { myUsers ->
            myUsers.forEach { user ->
                Log.i("MyTag", "name is ${user.name}")
            }
        })
    }
}
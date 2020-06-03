package com.example.themindfulparent

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.themindfulparent.activities.MeditationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setBackgroundDrawable(ColorDrawable(5))
        supportActionBar?.setTitle("")

    }

    fun startMeditation(view: View) {
        val intent = Intent(this, MeditationActivity::class.java)
        startActivity(intent)
    }
}

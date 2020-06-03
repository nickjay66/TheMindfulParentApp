package com.example.themindfulparent.activities

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.themindfulparent.R

class MeditationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation)
        setSupportActionBar(findViewById(R.id.toolbar2))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(5))

    }

    fun goParentMeditations(view: View) {
        val intent =  Intent(this, ParentMeditation::class.java);
        startActivity(intent);
    }
}


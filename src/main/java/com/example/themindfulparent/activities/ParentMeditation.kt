package com.example.themindfulparent.activities

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.themindfulparent.R
import com.example.themindfulparent.adapters.MyAdapter

class ParentMeditation : AppCompatActivity() {

    val myDataset = arrayOf<String>(
        "Intro to Mindfulness for Parents - Session 1",
        "Intro to Mindfulness for Parents - Session 2",
        "Intro to Mindfulness for Parents - Session 3",
        "Intro to Mindfulness for Parents - Session 4",
        "Intro to Mindfulness for Parents - Session 5"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent_meditation)
        setSupportActionBar(findViewById(R.id.toolbar3))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(5))

    }

    fun getMeditation() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun startMeditation(view: View) {
        var intent = Intent(this, MeditationPlayer::class.java)
        startActivity(intent)
    }
}



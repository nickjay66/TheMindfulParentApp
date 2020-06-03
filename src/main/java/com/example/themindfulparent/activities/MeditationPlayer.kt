package com.example.themindfulparent.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.view.View


class MeditationPlayer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.themindfulparent.R.layout.activity_meditation_player)

    }

    fun playMeditation(view: View) {
        var mediaPlayer = MediaPlayer.create(this, com.example.themindfulparent.R.raw.parentmeditationone)
        mediaPlayer.start()
    }

}

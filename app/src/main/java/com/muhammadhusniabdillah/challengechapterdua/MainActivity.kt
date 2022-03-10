package com.muhammadhusniabdillah.challengechapterdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.viewbinding.library.activity.viewBinding
import com.muhammadhusniabdillah.challengechapterdua.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.buttonMainGojek.setOnClickListener {
            startActivity(Intent(this, GojekChallenge::class.java))
        }
        binding.buttonMainTokped.setOnClickListener {
            startActivity(Intent(this, TokopediaChallenge::class.java))
        }
    }
}
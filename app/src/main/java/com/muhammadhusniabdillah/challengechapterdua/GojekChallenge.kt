package com.muhammadhusniabdillah.challengechapterdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.viewbinding.library.activity.viewBinding
import com.muhammadhusniabdillah.challengechapterdua.databinding.ActivityGojekChallengeBinding


class GojekChallenge : AppCompatActivity() {

    private val binding: ActivityGojekChallengeBinding by viewBinding()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gojek_challenge)
    }
}




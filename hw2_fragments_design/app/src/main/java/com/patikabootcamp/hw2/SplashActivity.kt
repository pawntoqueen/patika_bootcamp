package com.patikabootcamp.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import com.patikabootcamp.hw2.util.startActivity

class SplashActivity : AppCompatActivity() {

    private val DELAY : Long = 3 * 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer().schedule(
            object : TimerTask(){
                override fun run() {
                    startActivity<MainActivity>{}
                }
            }, DELAY
        )

    }
}
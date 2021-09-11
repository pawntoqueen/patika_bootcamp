package com.patikabootcamp.hw2

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patikabootcamp.hw2.util.addFragment
import com.patikabootcamp.hw2.util.replaceFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(WordScreenFragment(), R.id.fragment_container_view, "tag")


    }


}
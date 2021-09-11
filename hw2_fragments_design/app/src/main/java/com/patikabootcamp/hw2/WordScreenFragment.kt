package com.patikabootcamp.hw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.patikabootcamp.hw2.util.BaseFragment
import kotlinx.android.synthetic.main.fragment_word_screen.*

class WordScreenFragment : BaseFragment() {


    override fun getLayoutID(): Int = R.layout.fragment_word_screen



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        start_now_button.setOnClickListener {
            var fr = getFragmentManager()?.beginTransaction()
            fr?.replace(R.id.fragment_container_view, TestFragment())
            fr?.commit()
        }
    }



}
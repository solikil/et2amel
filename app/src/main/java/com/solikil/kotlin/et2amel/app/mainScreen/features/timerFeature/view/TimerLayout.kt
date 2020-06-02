package com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.solikil.kotlin.et2amel.app.R
import com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.presenter.TimerPresenter
import javax.inject.Inject

class TimerLayout : TimerView, Fragment() {

    @Inject
    lateinit var timerPresenter: TimerPresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_timer, container, false)
        // val textView: TextView = root.findViewById(text_home)

        return root
    }
}

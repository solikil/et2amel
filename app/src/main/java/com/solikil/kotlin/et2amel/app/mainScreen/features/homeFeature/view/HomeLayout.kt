package com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.solikil.kotlin.et2amel.app.FactorialCalculator
import com.solikil.kotlin.et2amel.app.NotificationUtil
import com.solikil.kotlin.et2amel.app.R
import com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.presenter.HomePresenter
import kotlinx.android.synthetic.main.fragment_home.view.*
import javax.inject.Inject

class HomeLayout : HomeView, Fragment() {

    @Inject
    lateinit var homePresenter: HomePresenter

    private val notificationUtil: NotificationUtil by lazy {
        NotificationUtil(
            this.requireActivity()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        // val textView: TextView = root.findViewById(text_home)
        root.button_compute.setOnClickListener {
            val input = root.edit_text_factorial.text.toString().toInt()
            val result = FactorialCalculator.computeFactorial(
                input
            ).toString()

            root.text_result.text = result
            root.text_result.visibility = View.VISIBLE

            notificationUtil.showNotification(
                context = this.requireActivity(),
                title = getString(R.string.notification_title),
                message = result
            )
        }

        return root
    }
}

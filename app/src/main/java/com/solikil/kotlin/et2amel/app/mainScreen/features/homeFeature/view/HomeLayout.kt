package com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.view

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.fragment.app.Fragment
import com.google.android.exoplayer2.DefaultLoadControl
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
import com.solikil.kotlin.et2amel.app.NotificationUtil
import com.solikil.kotlin.et2amel.app.R
import com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.presenter.HomePresenter
import javax.inject.Inject
import kotlinx.android.synthetic.main.custom_controller.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeLayout : HomeView, Fragment() {
    private var simpleExoPlayer: SimpleExoPlayer? = null
    var flag = false

    @Inject
    lateinit var homePresenter: HomePresenter
    private val notificationUtil: NotificationUtil by lazy {
        NotificationUtil(
            this.requireActivity()
        )
    }

    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val videoUrl: Uri = Uri.parse("https://i.imgur.com/WllAsEe.mp4")
        var loadControl = DefaultLoadControl()
        val bandwidthMeter = DefaultBandwidthMeter()
        val trackSelector = DefaultTrackSelector(AdaptiveTrackSelection.Factory(bandwidthMeter))
        simpleExoPlayer = ExoPlayerFactory.newSimpleInstance(this.requireContext(), trackSelector, loadControl)
        val factory = DefaultHttpDataSourceFactory(this.requireContext().getString(R.string.app_name))
        val extractorsFactory = DefaultExtractorsFactory()
        val mediaSource = ExtractorMediaSource(videoUrl, factory, extractorsFactory, null, null)

//        val player = SimpleExoPlayer.Builder(this.requireContext()).build()
//        var dataSourceFactory = DefaultDataSourceFactory(this.requireContext(), Util.getUserAgent(this.requireContext(), requireContext().getString(R.string.app_name)))
//         This is the MediaSource representing the media to be played.
//        var source = ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse("E:\\Mody\\Studying\\Android\\Solikil\\et2amel\\app\\src\\main\\res\\raw\\people_are_awesome.mp4"))

        root.playerView.player = simpleExoPlayer
        root.playerView.keepScreenOn = true
        simpleExoPlayer?.prepare(mediaSource)
        simpleExoPlayer?.playWhenReady = true
        simpleExoPlayer?.addListener(object : Player.EventListener {
            override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
                if (playbackState == Player.STATE_BUFFERING) {
                    root.progess_bar.visibility = View.VISIBLE
                } else if (playbackState == Player.STATE_READY) {
                    root.progess_bar.visibility = View.GONE
                }
            }
        })
        root.bt_fullscreen.setOnClickListener {
            if (flag) {
                root.bt_fullscreen.setImageDrawable(getDrawable(requireContext(), R.drawable.ic_fullscreen))
                activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                flag = false
            } else {
                root.bt_fullscreen.setImageDrawable(getDrawable(requireContext(), R.drawable.ic_fullscreen_exit))
                activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                flag = true
            }
        }
//        player.prepare(source)
//        player.playWhenReady = true

        /* root.button_compute.setOnClickListener {
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
        }  */

        return root
    }
    override fun onPause() {
        super.onPause()
        simpleExoPlayer?.playWhenReady = false
        simpleExoPlayer?.playbackState
    }
    override fun onResume() {
        super.onResume()
        simpleExoPlayer?.playWhenReady = true
        simpleExoPlayer?.playbackState
    }
}

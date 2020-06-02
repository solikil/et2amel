package com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.dagger

import com.solikil.kotlin.et2amel.app.base.dagger.FeatureScope
import com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.presenter.TimerPresenter
import com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.presenter.TimerPresenterImp
import com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.view.TimerView
import dagger.Module
import dagger.Provides

@Module
class TimerModule(private val timerView: TimerView) {
    @FeatureScope
    @Provides
    fun providesTimerView(): TimerView = timerView

    @FeatureScope
    @Provides
    fun providesTimerPresenter(timerPresenter: TimerPresenterImp): TimerPresenter = timerPresenter
}

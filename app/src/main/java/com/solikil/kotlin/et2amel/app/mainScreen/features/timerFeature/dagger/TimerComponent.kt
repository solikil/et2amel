package com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.dagger

import com.solikil.kotlin.et2amel.app.base.dagger.FeatureScope
import com.solikil.kotlin.et2amel.app.mainScreen.dagger.MainScreenComponent
import com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.view.TimerLayout
import dagger.Component

@FeatureScope
@Component(dependencies = [MainScreenComponent::class], modules = [TimerModule::class])
interface TimerComponent {
    fun injectTimerView(timerLayout: TimerLayout)
}

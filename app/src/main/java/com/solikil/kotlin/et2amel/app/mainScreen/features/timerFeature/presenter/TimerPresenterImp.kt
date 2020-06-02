package com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.presenter

import com.solikil.kotlin.et2amel.app.mainScreen.features.timerFeature.view.TimerView
import com.solikil.kotlin.et2amel.app.mainScreen.interactor.MainScreenInteractor
import javax.inject.Inject

class TimerPresenterImp @Inject constructor(
    private val timerView: TimerView,
    private val mainScreenInteractor: MainScreenInteractor
) : TimerPresenter { /*...*/ }

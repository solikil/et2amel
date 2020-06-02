package com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.presenter

import com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.view.HomeView
import com.solikil.kotlin.et2amel.app.mainScreen.interactor.MainScreenInteractor
import javax.inject.Inject

class HomePresenterImp @Inject constructor(
    private val homeView: HomeView,
    private val mainScreenInteractor: MainScreenInteractor
) : HomePresenter { /*...*/ }

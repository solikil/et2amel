package com.solikil.kotlin.et2amel.app.mainScreen.presenter

import com.solikil.kotlin.et2amel.app.mainScreen.interactor.MainScreenInteractor
import javax.inject.Inject

class MainScreenPresenterImp @Inject constructor(
    private val mainScreenInteractor: MainScreenInteractor
) : MainScreenPresenter { /*...*/ }

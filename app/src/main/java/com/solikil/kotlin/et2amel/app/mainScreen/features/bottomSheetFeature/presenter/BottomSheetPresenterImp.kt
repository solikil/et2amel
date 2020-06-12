package com.solikil.kotlin.et2amel.app.mainScreen.features.bottomSheetFeature.presenter

import com.solikil.kotlin.et2amel.app.mainScreen.features.bottomSheetFeature.view.BottomSheetView
import com.solikil.kotlin.et2amel.app.mainScreen.interactor.MainScreenInteractor
import javax.inject.Inject

class BottomSheetPresenterImp @Inject constructor(
    private val bottomSheetView: BottomSheetView,
    private val mainScreenInteractor: MainScreenInteractor
) : BottomSheetPresenter { /*...*/ }

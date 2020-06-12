package com.solikil.kotlin.et2amel.app.mainScreen.features.bottomSheetFeature.dagger

import com.solikil.kotlin.et2amel.app.base.dagger.FeatureScope
import com.solikil.kotlin.et2amel.app.mainScreen.features.bottomSheetFeature.presenter.BottomSheetPresenter
import com.solikil.kotlin.et2amel.app.mainScreen.features.bottomSheetFeature.presenter.BottomSheetPresenterImp
import com.solikil.kotlin.et2amel.app.mainScreen.features.bottomSheetFeature.view.BottomSheetView
import dagger.Module
import dagger.Provides

@Module
class BottomSheetModule(private val bottomSheetView: BottomSheetView) {
    @FeatureScope
    @Provides
    fun providesBottomSheetView(): BottomSheetView = bottomSheetView

    @FeatureScope
    @Provides
    fun providesBottomSheetPresenter(bottomSheetPresenter: BottomSheetPresenterImp): BottomSheetPresenter =
        bottomSheetPresenter
}

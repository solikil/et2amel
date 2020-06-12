package com.solikil.kotlin.et2amel.app.mainScreen.features.bottomSheetFeature.dagger

import com.solikil.kotlin.et2amel.app.base.dagger.FeatureScope
import com.solikil.kotlin.et2amel.app.mainScreen.dagger.MainScreenComponent
import com.solikil.kotlin.et2amel.app.mainScreen.features.bottomSheetFeature.view.BottomSheetLayout
import dagger.Component

@FeatureScope
@Component(dependencies = [MainScreenComponent::class], modules = [BottomSheetModule::class])
interface BottomSheetComponent {
    fun injectBottomSheetView(bottomSheetLayout: BottomSheetLayout)
}

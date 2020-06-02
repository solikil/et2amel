package com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.dagger

import com.solikil.kotlin.et2amel.app.base.dagger.FeatureScope
import com.solikil.kotlin.et2amel.app.mainScreen.dagger.MainScreenComponent
import com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.view.HomeLayout
import dagger.Component

@FeatureScope
@Component(dependencies = [MainScreenComponent::class], modules = [HomeModule::class])
interface HomeComponent {
    fun injectHomeView(homeLayout: HomeLayout)
}

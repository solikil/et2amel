package com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.dagger

import com.solikil.kotlin.et2amel.app.base.dagger.FeatureScope
import com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.presenter.HomePresenter
import com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.presenter.HomePresenterImp
import com.solikil.kotlin.et2amel.app.mainScreen.features.homeFeature.view.HomeView
import dagger.Module
import dagger.Provides

@Module
class HomeModule(private val homeView: HomeView) {
    @FeatureScope
    @Provides
    fun providesHomeView(): HomeView = homeView

    @FeatureScope
    @Provides
    fun providesHomePresenter(homePresenter: HomePresenterImp): HomePresenter = homePresenter
}

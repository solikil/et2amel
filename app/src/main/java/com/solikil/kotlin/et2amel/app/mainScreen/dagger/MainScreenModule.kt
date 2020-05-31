package com.solikil.kotlin.et2amel.app.mainScreen.dagger

import android.content.res.Resources
import com.solikil.kotlin.et2amel.app.base.dagger.ApplicationScope
import com.solikil.kotlin.et2amel.app.mainScreen.interactor.MainScreenInteractor
import com.solikil.kotlin.et2amel.app.mainScreen.interactor.MainScreenInteractorImp
import com.solikil.kotlin.et2amel.app.mainScreen.presenter.MainScreenPresenter
import com.solikil.kotlin.et2amel.app.mainScreen.presenter.MainScreenPresenterImp
import com.solikil.kotlin.et2amel.app.mainScreen.view.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainScreenModule(private val mainScreenView: MainActivity) {

    @ApplicationScope
    @Provides
    fun providesMainScreenPresenter(
        mainScreenPresenter: MainScreenPresenterImp
    ): MainScreenPresenter =
        mainScreenPresenter

    @ApplicationScope
    @Provides
    fun providesMainScreenInteractor(
        mainScreenInteractor: MainScreenInteractorImp
    ): MainScreenInteractor =
        mainScreenInteractor

    @ApplicationScope
    @Provides
    fun providesResources(): Resources = mainScreenView.resources
}
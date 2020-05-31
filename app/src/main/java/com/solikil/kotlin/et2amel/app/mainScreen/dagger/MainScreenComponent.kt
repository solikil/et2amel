package com.solikil.kotlin.et2amel.app.mainScreen.dagger

import android.content.res.Resources
import com.solikil.kotlin.et2amel.app.base.dagger.ApplicationScope
import com.solikil.kotlin.et2amel.app.mainScreen.interactor.MainScreenInteractor
import com.solikil.kotlin.et2amel.app.mainScreen.presenter.MainScreenPresenter
import com.solikil.kotlin.et2amel.app.mainScreen.view.MainActivity
import com.solikil.kotlin.et2amel.app.network.NetworkModule
import dagger.Component

@ApplicationScope
@Component(modules = [MainScreenModule::class, NetworkModule::class])
interface MainScreenComponent {
    fun injectMainScreenActivity(mainScreenActivity: MainActivity)

    val mainScreenPresenter: MainScreenPresenter

    val mainScreenInteractor: MainScreenInteractor

    val resources: Resources
}

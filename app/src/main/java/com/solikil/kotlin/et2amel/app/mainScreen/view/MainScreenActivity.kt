package com.solikil.kotlin.et2amel.app.mainScreen.view

import BottomSheetLayout
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.solikil.kotlin.et2amel.app.R
import com.solikil.kotlin.et2amel.app.mainScreen.dagger.DaggerMainScreenComponent
import com.solikil.kotlin.et2amel.app.mainScreen.dagger.MainScreenComponent
import com.solikil.kotlin.et2amel.app.mainScreen.dagger.MainScreenModule
import com.solikil.kotlin.et2amel.app.mainScreen.presenter.MainScreenPresenter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainScreenActivity : AppCompatActivity() {

    @Inject
    lateinit var mainScreenPresenter: MainScreenPresenter

    private val mainScreenComponent: MainScreenComponent by lazy {
        DaggerMainScreenComponent.builder()
            .mainScreenModule(MainScreenModule(this))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependencies()
        setContentView(R.layout.activity_main)
        setupBottomSheetFragment()
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = setupBottomNavigation()
        navView.setupWithNavController(navController)
    }

    private fun setupBottomNavigation(): NavController {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val appBarConfiguration =
            AppBarConfiguration(setOf(R.id.navigation_home, R.id.navigation_timer))
        setupActionBarWithNavController(navController, appBarConfiguration)
        return navController
    }

    private fun setupBottomSheetFragment() {
        btnBottomSheetDialogFragment.setOnClickListener {
            val bottomSheetFragment = BottomSheetLayout()
            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
        }
    }

    private fun injectDependencies() {
        mainScreenComponent.injectMainScreenActivity(this)
    }
}

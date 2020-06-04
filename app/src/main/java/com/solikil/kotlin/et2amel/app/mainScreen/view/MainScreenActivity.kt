package com.solikil.kotlin.et2amel.app.mainScreen.view

import BottomSheetFragment
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.solikil.kotlin.et2amel.app.R
import com.solikil.kotlin.et2amel.app.mainScreen.dagger.DaggerMainScreenComponent
import com.solikil.kotlin.et2amel.app.mainScreen.dagger.MainScreenComponent
import com.solikil.kotlin.et2amel.app.mainScreen.dagger.MainScreenModule
import com.solikil.kotlin.et2amel.app.mainScreen.presenter.MainScreenPresenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet.*
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


///////////////////////////////////////////////////
        val bottomSheetBehavior = BottomSheetBehavior.from(bottom_sheet_layout)
        btnBottomSheet.setOnClickListener {
            if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
            } else {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED)
            }
        }

        btnBottomSheetDialog.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.bottom_sheet, null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }

        btnBottomSheetDialogFragment.setOnClickListener {
            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
        }

        bottomSheetBehavior.setBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // React to state change
                when (newState) {
                    BottomSheetBehavior.STATE_HIDDEN -> {
                    }
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        Log.println(Log.INFO, "df", "expanded")
                    }
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                    }
                    BottomSheetBehavior.STATE_DRAGGING -> {
                    }
                    BottomSheetBehavior.STATE_SETTLING -> {
                    }
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // React to dragging events
            }
        })
////////////////////////////////////////////////////

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val appBarConfiguration =
            AppBarConfiguration(setOf(R.id.navigation_home, R.id.navigation_timer))
        setupActionBarWithNavController(navController, appBarConfiguration)

        navView.setupWithNavController(navController)
    }

    private fun injectDependencies() {
        mainScreenComponent.injectMainScreenActivity(this)
    }
}

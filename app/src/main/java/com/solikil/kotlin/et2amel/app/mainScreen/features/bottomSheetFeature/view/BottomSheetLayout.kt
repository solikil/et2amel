package com.solikil.kotlin.et2amel.app.mainScreen.features.bottomSheetFeature.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.solikil.kotlin.et2amel.app.R

class BottomSheetLayout : BottomSheetView, BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.bottom_sheet, container, false)
}

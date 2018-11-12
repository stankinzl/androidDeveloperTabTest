package com.example.stanislavkinzl.tabtestupdateddep.feature.feature_comicslist.widget.widget_marveltoolbar

import androidx.appcompat.app.AppCompatActivity
import android.view.View
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.widget_toolbar.*
import javax.inject.Inject

class ToolbarWidgetImpl @Inject constructor(
) : ToolbarWidget, LayoutContainer {

    override lateinit var containerView: View

    override fun init(view: View) {
        containerView = view
    }

    override fun setToolbar(activity: AppCompatActivity) {
        activity.setSupportActionBar(toolbar)
    }

}
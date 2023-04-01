package com.kindleapp.app.modules.loadingscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityLoadingScreenBinding
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.loadingscreen.`data`.viewmodel.LoadingScreenVM
import kotlin.String
import kotlin.Unit

class LoadingScreenActivity :
    BaseActivity<ActivityLoadingScreenBinding>(R.layout.activity_loading_screen) {
  private val viewModel: LoadingScreenVM by viewModels<LoadingScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loadingScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStacklogofinalone.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoadingScreen.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOADING_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoadingScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.kindleapp.app.modules.loadingscreentwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityLoadingScreenTwoBinding
import com.kindleapp.app.modules.loadingscreentwo.`data`.viewmodel.LoadingScreenTwoVM
import com.kindleapp.app.modules.userhomepage.ui.UserHomePageActivity
import kotlin.String
import kotlin.Unit

class LoadingScreenTwoActivity :
    BaseActivity<ActivityLoadingScreenTwoBinding>(R.layout.activity_loading_screen_two) {
  private val viewModel: LoadingScreenTwoVM by viewModels<LoadingScreenTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loadingScreenTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearLoadingScreen.setOnClickListener {
      val destIntent = UserHomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStacklogofinalone.setOnClickListener {
      val destIntent = UserHomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOADING_SCREEN_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoadingScreenTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

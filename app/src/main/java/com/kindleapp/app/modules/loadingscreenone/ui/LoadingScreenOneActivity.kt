package com.kindleapp.app.modules.loadingscreenone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityLoadingScreenOneBinding
import com.kindleapp.app.modules.loadingscreenone.`data`.viewmodel.LoadingScreenOneVM
import com.kindleapp.app.modules.loginscreen.ui.LogInScreenActivity
import kotlin.String
import kotlin.Unit

class LoadingScreenOneActivity :
    BaseActivity<ActivityLoadingScreenOneBinding>(R.layout.activity_loading_screen_one) {
  private val viewModel: LoadingScreenOneVM by viewModels<LoadingScreenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loadingScreenOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LogInScreenActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.linearLoadingScreen.setOnClickListener {
        val destIntent = LogInScreenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.frameStacklogofinalone.setOnClickListener {
        val destIntent = LogInScreenActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOADING_SCREEN_ONE_ACTIVITY"

    }
  }

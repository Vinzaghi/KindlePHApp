package com.kindleapp.app.modules.facebook.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityFacebookBinding
import com.kindleapp.app.modules.facebook.`data`.viewmodel.FacebookVM
import kotlin.String
import kotlin.Unit

class FacebookActivity : BaseActivity<ActivityFacebookBinding>(R.layout.activity_facebook) {
  private val viewModel: FacebookVM by viewModels<FacebookVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.facebookVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FACEBOOK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FacebookActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

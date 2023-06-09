package com.kindleapp.app.modules.userhomepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityUserHomePageBinding
import com.kindleapp.app.modules.userhomepage.`data`.viewmodel.UserHomePageVM
import kotlin.String
import kotlin.Unit

class UserHomePageActivity :
    BaseActivity<ActivityUserHomePageBinding>(R.layout.activity_user_home_page) {
  private val viewModel: UserHomePageVM by viewModels<UserHomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userHomePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "USER_HOME_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserHomePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

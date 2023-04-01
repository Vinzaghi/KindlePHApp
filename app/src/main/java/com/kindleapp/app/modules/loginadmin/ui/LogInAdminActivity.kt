package com.kindleapp.app.modules.loginadmin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityLogInAdminBinding
import com.kindleapp.app.modules.forgetpassemail.ui.ForgetPassEmailActivity
import com.kindleapp.app.modules.loadingscreen.ui.LoadingScreenActivity
import com.kindleapp.app.modules.loginadmin.`data`.viewmodel.LogInAdminVM
import com.kindleapp.app.modules.loginscreen.ui.LogInScreenActivity
import kotlin.String
import kotlin.Unit

class LogInAdminActivity : BaseActivity<ActivityLogInAdminBinding>(R.layout.activity_log_in_admin) {
  private val viewModel: LogInAdminVM by viewModels<LogInAdminVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInAdminVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLoginasUser.setOnClickListener {
      val destIntent = LogInScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtForgotPassword.setOnClickListener {
      val destIntent = ForgetPassEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogIn.setOnClickListener {
      val destIntent = LoadingScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOG_IN_ADMIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInAdminActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

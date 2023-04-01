package com.kindleapp.app.modules.loginadminerror.ui

import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityLogInAdminErrorBinding
import com.kindleapp.app.modules.forgetpassemail.ui.ForgetPassEmailActivity
import com.kindleapp.app.modules.loadingscreen.ui.LoadingScreenActivity
import com.kindleapp.app.modules.loginadminerror.`data`.viewmodel.LogInAdminErrorVM
import com.kindleapp.app.modules.loginscreen.ui.LogInScreenActivity
import kotlin.String
import kotlin.Unit

class LogInAdminErrorActivity :
    BaseActivity<ActivityLogInAdminErrorBinding>(R.layout.activity_log_in_admin_error) {
  private val viewModel: LogInAdminErrorVM by viewModels<LogInAdminErrorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInAdminErrorVM = viewModel
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
    const val TAG: String = "LOG_IN_ADMIN_ERROR_ACTIVITY"

  }
}

package com.kindleapp.app.modules.loginerrorscreen.ui

import android.content.Intent
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.appcomponents.facebookauth.FacebookHelper
import com.kindleapp.app.databinding.ActivityLogInErrorScreenBinding
import com.kindleapp.app.modules.facebook.ui.FacebookActivity
import com.kindleapp.app.modules.forgetpassemail.ui.ForgetPassEmailActivity
import com.kindleapp.app.modules.google.ui.GoogleActivity
import com.kindleapp.app.modules.loadingscreentwo.ui.LoadingScreenTwoActivity
import com.kindleapp.app.modules.loginadmin.ui.LogInAdminActivity
import com.kindleapp.app.modules.loginerrorscreen.`data`.viewmodel.LogInErrorScreenVM
import com.kindleapp.app.modules.signuppage.ui.SignUpPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LogInErrorScreenActivity :
    BaseActivity<ActivityLogInErrorScreenBinding>(R.layout.activity_log_in_error_screen) {
  private val viewModel: LogInErrorScreenVM by viewModels<LogInErrorScreenVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInErrorScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowgmailone.setOnClickListener {
      val destIntent = GoogleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtForgotPassword.setOnClickListener {
      val destIntent = ForgetPassEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowfblogoone.setOnClickListener {
      val destIntent = FacebookActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowfblogoone.setOnClickListener {
      LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
      facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
        override fun onSuccess(result: LoginResult?) {
        }
        override fun onError(error: FacebookException?) {
        }
        override fun onCancel() {
        }
        })
      }
      binding.txtLoginasAdmin.setOnClickListener {
        val destIntent = LogInAdminActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtNeedanAccount.setOnClickListener {
        val destIntent = SignUpPageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnSignIn.setOnClickListener {
        val destIntent = LoadingScreenTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOG_IN_ERROR_SCREEN_ACTIVITY"

    }
  }

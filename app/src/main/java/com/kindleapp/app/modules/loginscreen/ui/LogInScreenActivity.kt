package com.kindleapp.app.modules.loginscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.appcomponents.facebookauth.FacebookHelper
import com.kindleapp.app.databinding.ActivityLogInScreenBinding
import com.kindleapp.app.modules.facebook.ui.FacebookActivity
import com.kindleapp.app.modules.forgetpassemail.ui.ForgetPassEmailActivity
import com.kindleapp.app.modules.google.ui.GoogleActivity
import com.kindleapp.app.modules.loadingscreentwo.ui.LoadingScreenTwoActivity
import com.kindleapp.app.modules.loginadmin.ui.LogInAdminActivity
import com.kindleapp.app.modules.loginscreen.`data`.viewmodel.LogInScreenVM
import com.kindleapp.app.modules.signuppage.ui.SignUpPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LogInScreenActivity :
    BaseActivity<ActivityLogInScreenBinding>(R.layout.activity_log_in_screen) {
  private val viewModel: LogInScreenVM by viewModels<LogInScreenVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()


  private val facebookLogin: FacebookHelper = FacebookHelper()


  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ): Unit {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLoginasAdmin.setOnClickListener {
      val destIntent = LogInAdminActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtNeedanAccount.setOnClickListener {
      val destIntent = SignUpPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
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
      binding.btnSignIn.setOnClickListener {
        val destIntent = LoadingScreenTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOG_IN_SCREEN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LogInScreenActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

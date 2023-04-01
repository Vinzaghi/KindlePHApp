package com.kindleapp.app.modules.signupsuccessful.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivitySignUpSuccessfulBinding
import com.kindleapp.app.modules.loginscreen.ui.LogInScreenActivity
import com.kindleapp.app.modules.signupsuccessful.`data`.viewmodel.SignUpSuccessfulVM
import kotlin.String
import kotlin.Unit

class SignUpSuccessfulActivity :
    BaseActivity<ActivitySignUpSuccessfulBinding>(R.layout.activity_sign_up_successful) {
  private val viewModel: SignUpSuccessfulVM by viewModels<SignUpSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGoBack.setOnClickListener {
      val destIntent = LogInScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_SUCCESSFUL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpSuccessfulActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

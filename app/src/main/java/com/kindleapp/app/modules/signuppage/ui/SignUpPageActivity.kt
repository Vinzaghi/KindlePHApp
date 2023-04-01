package com.kindleapp.app.modules.signuppage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivitySignUpPageBinding
import com.kindleapp.app.modules.loginscreen.ui.LogInScreenActivity
import com.kindleapp.app.modules.signuppage.`data`.viewmodel.SignUpPageVM
import com.kindleapp.app.modules.signupsuccessful.ui.SignUpSuccessfulActivity
import kotlin.String
import kotlin.Unit

class SignUpPageActivity : BaseActivity<ActivitySignUpPageBinding>(R.layout.activity_sign_up_page) {
  private val viewModel: SignUpPageVM by viewModels<SignUpPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignUpOne.setOnClickListener {
      val destIntent = SignUpSuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtConfirmation.setOnClickListener {
      val destIntent = LogInScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

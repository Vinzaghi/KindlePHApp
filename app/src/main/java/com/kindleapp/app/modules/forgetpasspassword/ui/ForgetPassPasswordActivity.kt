package com.kindleapp.app.modules.forgetpasspassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityForgetPassPasswordBinding
import com.kindleapp.app.modules.forgetpasspassword.`data`.viewmodel.ForgetPassPasswordVM
import com.kindleapp.app.modules.forgetpasssuccessful.ui.ForgetPassSuccessfulActivity
import kotlin.String
import kotlin.Unit

class ForgetPassPasswordActivity :
    BaseActivity<ActivityForgetPassPasswordBinding>(R.layout.activity_forget_pass_password) {
  private val viewModel: ForgetPassPasswordVM by viewModels<ForgetPassPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnReset.setOnClickListener {
      val destIntent = ForgetPassSuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

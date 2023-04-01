package com.kindleapp.app.modules.forgetpassemail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityForgetPassEmailBinding
import com.kindleapp.app.modules.forgetpassemail.`data`.viewmodel.ForgetPassEmailVM
import com.kindleapp.app.modules.forgetpasspassword.ui.ForgetPassPasswordActivity
import kotlin.String
import kotlin.Unit

class ForgetPassEmailActivity :
    BaseActivity<ActivityForgetPassEmailBinding>(R.layout.activity_forget_pass_email) {
  private val viewModel: ForgetPassEmailVM by viewModels<ForgetPassEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = ForgetPassPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_EMAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassEmailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

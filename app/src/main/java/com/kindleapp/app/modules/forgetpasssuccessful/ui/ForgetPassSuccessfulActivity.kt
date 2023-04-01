package com.kindleapp.app.modules.forgetpasssuccessful.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityForgetPassSuccessfulBinding
import com.kindleapp.app.modules.forgetpasssuccessful.`data`.viewmodel.ForgetPassSuccessfulVM
import com.kindleapp.app.modules.loginscreen.ui.LogInScreenActivity
import kotlin.String
import kotlin.Unit

class ForgetPassSuccessfulActivity :
    BaseActivity<ActivityForgetPassSuccessfulBinding>(R.layout.activity_forget_pass_successful) {
  private val viewModel: ForgetPassSuccessfulVM by viewModels<ForgetPassSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGoBack.setOnClickListener {
      val destIntent = LogInScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_SUCCESSFUL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassSuccessfulActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

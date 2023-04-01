package com.kindleapp.app.modules.adminlogoutconfirmation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAdminLogOutConfirmationBinding
import com.kindleapp.app.modules.adminlogoutconfirmation.`data`.viewmodel.AdminLogOutConfirmationVM
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.loginscreen.ui.LogInScreenActivity
import kotlin.String
import kotlin.Unit

class AdminLogOutConfirmationActivity :
    BaseActivity<ActivityAdminLogOutConfirmationBinding>(R.layout.activity_admin_log_out_confirmation)
    {
  private val viewModel: AdminLogOutConfirmationVM by viewModels<AdminLogOutConfirmationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminLogOutConfirmationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtYes.setOnClickListener {
      val destIntent = LogInScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtNo.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADMIN_LOG_OUT_CONFIRMATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminLogOutConfirmationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

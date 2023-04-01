package com.kindleapp.app.modules.adminsuccessfullychangepassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAdminSuccessfullyChangePasswordBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.adminsuccessfullychangepassword.`data`.viewmodel.AdminSuccessfullyChangePasswordVM
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import kotlin.String
import kotlin.Unit

class AdminSuccessfullyChangePasswordActivity :
    BaseActivity<ActivityAdminSuccessfullyChangePasswordBinding>(R.layout.activity_admin_successfully_change_password)
    {
  private val viewModel: AdminSuccessfullyChangePasswordVM by
      viewModels<AdminSuccessfullyChangePasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminSuccessfullyChangePasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSheet.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADMIN_SUCCESSFULLY_CHANGE_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminSuccessfullyChangePasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

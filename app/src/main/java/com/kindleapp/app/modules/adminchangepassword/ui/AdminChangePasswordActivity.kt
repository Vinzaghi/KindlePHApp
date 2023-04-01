package com.kindleapp.app.modules.adminchangepassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAdminChangePasswordBinding
import com.kindleapp.app.modules.adminchangepassword.`data`.viewmodel.AdminChangePasswordVM
import com.kindleapp.app.modules.admindeleteaccount.ui.AdminDeleteAccountActivity
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.adminsuccessfullychangepassword.ui.AdminSuccessfullyChangePasswordActivity
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import kotlin.String
import kotlin.Unit

class AdminChangePasswordActivity :
    BaseActivity<ActivityAdminChangePasswordBinding>(R.layout.activity_admin_change_password) {
  private val viewModel: AdminChangePasswordVM by viewModels<AdminChangePasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminChangePasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnDeleteAccount.setOnClickListener {
      val destIntent = AdminDeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageTotalSales.setOnClickListener {
      val destIntent = MySalesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnSave.setOnClickListener {
      val destIntent = AdminSuccessfullyChangePasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADMIN_CHANGE_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminChangePasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

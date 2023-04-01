package com.kindleapp.app.modules.adminprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAdminProfileBinding
import com.kindleapp.app.modules.adminchangepassword.ui.AdminChangePasswordActivity
import com.kindleapp.app.modules.adminchangesocials.ui.AdminChangeSocialsActivity
import com.kindleapp.app.modules.admineditpersonalinformation.ui.AdminEditPersonalInformationActivity
import com.kindleapp.app.modules.adminlogoutconfirmation.ui.AdminLogOutConfirmationActivity
import com.kindleapp.app.modules.adminprofile.`data`.viewmodel.AdminProfileVM
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import kotlin.String
import kotlin.Unit

class AdminProfileActivity :
    BaseActivity<ActivityAdminProfileBinding>(R.layout.activity_admin_profile) {
  private val viewModel: AdminProfileVM by viewModels<AdminProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnChangePasswordOne.setOnClickListener {
      val destIntent = AdminChangePasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnEdit.setOnClickListener {
      val destIntent = AdminChangeSocialsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogOut.setOnClickListener {
      val destIntent = AdminLogOutConfirmationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnEditOne.setOnClickListener {
      val destIntent = AdminEditPersonalInformationActivity.getIntent(this, null)
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
  }

  companion object {
    const val TAG: String = "ADMIN_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

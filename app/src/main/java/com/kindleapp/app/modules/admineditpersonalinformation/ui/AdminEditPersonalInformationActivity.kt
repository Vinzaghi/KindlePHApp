package com.kindleapp.app.modules.admineditpersonalinformation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAdminEditPersonalInformationBinding
import com.kindleapp.app.modules.admineditpersonalinformation.`data`.viewmodel.AdminEditPersonalInformationVM
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.adminsuccessfullyeditpersonalinformation.ui.AdminSuccessfullyEditPersonalInformationActivity
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import kotlin.String
import kotlin.Unit

class AdminEditPersonalInformationActivity :
    BaseActivity<ActivityAdminEditPersonalInformationBinding>(R.layout.activity_admin_edit_personal_information)
    {
  private val viewModel: AdminEditPersonalInformationVM by
      viewModels<AdminEditPersonalInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminEditPersonalInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUserTwo.setOnClickListener {
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
      val destIntent = AdminSuccessfullyEditPersonalInformationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADMIN_EDIT_PERSONAL_INFORMATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminEditPersonalInformationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

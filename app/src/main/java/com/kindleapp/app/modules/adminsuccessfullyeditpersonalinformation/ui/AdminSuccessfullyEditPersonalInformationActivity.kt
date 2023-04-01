package com.kindleapp.app.modules.adminsuccessfullyeditpersonalinformation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAdminSuccessfullyEditPersonalInformationBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.adminsuccessfullyeditpersonalinformation.`data`.viewmodel.AdminSuccessfullyEditPersonalInformationVM
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import kotlin.String
import kotlin.Unit

class AdminSuccessfullyEditPersonalInformationActivity :
    BaseActivity<ActivityAdminSuccessfullyEditPersonalInformationBinding>(R.layout.activity_admin_successfully_edit_personal_information)
    {
  private val viewModel: AdminSuccessfullyEditPersonalInformationVM by
      viewModels<AdminSuccessfullyEditPersonalInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminSuccessfullyEditPersonalInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageSheet.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADMIN_SUCCESSFULLY_EDIT_PERSONAL_INFORMATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminSuccessfullyEditPersonalInformationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.kindleapp.app.modules.admindeleteaccount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAdminDeleteAccountBinding
import com.kindleapp.app.modules.adminchangepassword.ui.AdminChangePasswordActivity
import com.kindleapp.app.modules.admindeleteaccount.`data`.viewmodel.AdminDeleteAccountVM
import com.kindleapp.app.modules.admindeleteaccountone.ui.AdminDeleteAccountOneActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import kotlin.String
import kotlin.Unit

class AdminDeleteAccountActivity :
    BaseActivity<ActivityAdminDeleteAccountBinding>(R.layout.activity_admin_delete_account) {
  private val viewModel: AdminDeleteAccountVM by viewModels<AdminDeleteAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminDeleteAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtYes.setOnClickListener {
      val destIntent = AdminDeleteAccountOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtNo.setOnClickListener {
      val destIntent = AdminChangePasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADMIN_DELETE_ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminDeleteAccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

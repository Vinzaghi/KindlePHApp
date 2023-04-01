package com.kindleapp.app.modules.admindeleteaccountone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAdminDeleteAccountOneBinding
import com.kindleapp.app.modules.admindeleteaccountone.`data`.viewmodel.AdminDeleteAccountOneVM
import com.kindleapp.app.modules.loginscreen.ui.LogInScreenActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import kotlin.String
import kotlin.Unit

class AdminDeleteAccountOneActivity :
    BaseActivity<ActivityAdminDeleteAccountOneBinding>(R.layout.activity_admin_delete_account_one) {
  private val viewModel: AdminDeleteAccountOneVM by viewModels<AdminDeleteAccountOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminDeleteAccountOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageSheet.setOnClickListener {
      val destIntent = LogInScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADMIN_DELETE_ACCOUNT_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminDeleteAccountOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

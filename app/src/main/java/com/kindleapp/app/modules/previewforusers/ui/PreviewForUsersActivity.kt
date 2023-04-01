package com.kindleapp.app.modules.previewforusers.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityPreviewForUsersBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import com.kindleapp.app.modules.previewforusers.`data`.viewmodel.PreviewForUsersVM
import kotlin.String
import kotlin.Unit

class PreviewForUsersActivity :
    BaseActivity<ActivityPreviewForUsersBinding>(R.layout.activity_preview_for_users) {
  private val viewModel: PreviewForUsersVM by viewModels<PreviewForUsersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.previewForUsersVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageTotalSales.setOnClickListener {
      val destIntent = MySalesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PREVIEW_FOR_USERS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PreviewForUsersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

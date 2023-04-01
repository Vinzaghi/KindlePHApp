package com.kindleapp.app.modules.dashboardhome.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityDashboardHomeBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.createnewfeaturedproduct.ui.CreateNewFeaturedProductActivity
import com.kindleapp.app.modules.dashboardhome.`data`.viewmodel.DashboardHomeVM
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import com.kindleapp.app.modules.previewforusers.ui.PreviewForUsersActivity
import kotlin.String
import kotlin.Unit

class DashboardHomeActivity :
    BaseActivity<ActivityDashboardHomeBinding>(R.layout.activity_dashboard_home) {
  private val viewModel: DashboardHomeVM by viewModels<DashboardHomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dashboardHomeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumneye.setOnClickListener {
      val destIntent = PreviewForUsersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnplus.setOnClickListener {
      val destIntent = CreateNewFeaturedProductActivity.getIntent(this, null)
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
    binding.imageTotalSales.setOnClickListener {
      val destIntent = MySalesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardHomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

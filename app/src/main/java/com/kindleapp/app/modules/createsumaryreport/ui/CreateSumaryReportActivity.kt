package com.kindleapp.app.modules.createsumaryreport.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityCreateSumaryReportBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.createsumaryreport.`data`.viewmodel.CreateSumaryReportVM
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.filterbutton.ui.FilterButtonActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import kotlin.String
import kotlin.Unit

class CreateSumaryReportActivity :
    BaseActivity<ActivityCreateSumaryReportBinding>(R.layout.activity_create_sumary_report) {
  private val viewModel: CreateSumaryReportVM by viewModels<CreateSumaryReportVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createSumaryReportVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSettings.setOnClickListener {
      val destIntent = FilterButtonActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageTotalSales.setOnClickListener {
      val destIntent = MySalesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CREATE_SUMARY_REPORT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateSumaryReportActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

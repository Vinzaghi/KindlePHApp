package com.kindleapp.app.modules.mysales.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityMySalesBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.createsumaryreport.ui.CreateSumaryReportActivity
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.filterbutton.ui.FilterButtonActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.`data`.viewmodel.MySalesVM
import com.kindleapp.app.modules.viewtransactions.ui.ViewTransactionsActivity
import kotlin.String
import kotlin.Unit

class MySalesActivity : BaseActivity<ActivityMySalesBinding>(R.layout.activity_my_sales) {
  private val viewModel: MySalesVM by viewModels<MySalesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mySalesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnplus.setOnClickListener {
      val destIntent = CreateSumaryReportActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSettings.setOnClickListener {
      val destIntent = FilterButtonActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnmenu.setOnClickListener {
      val destIntent = ViewTransactionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MY_SALES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MySalesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

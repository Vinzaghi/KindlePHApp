package com.kindleapp.app.modules.createproductsuccessful.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityCreateProductSuccessfulBinding
import com.kindleapp.app.modules.createnewproduct.ui.CreateNewProductActivity
import com.kindleapp.app.modules.createproductsuccessful.`data`.viewmodel.CreateProductSuccessfulVM
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import kotlin.String
import kotlin.Unit

class CreateProductSuccessfulActivity :
    BaseActivity<ActivityCreateProductSuccessfulBinding>(R.layout.activity_create_product_successful)
    {
  private val viewModel: CreateProductSuccessfulVM by viewModels<CreateProductSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createProductSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtNo.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtYes.setOnClickListener {
      val destIntent = CreateNewProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CREATE_PRODUCT_SUCCESSFUL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateProductSuccessfulActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

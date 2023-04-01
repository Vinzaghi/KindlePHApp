package com.kindleapp.app.modules.editproductssuccessful.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityEditProductsSuccessfulBinding
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.editproductssuccessful.`data`.viewmodel.EditProductsSuccessfulVM
import kotlin.String
import kotlin.Unit

class EditProductsSuccessfulActivity :
    BaseActivity<ActivityEditProductsSuccessfulBinding>(R.layout.activity_edit_products_successful)
    {
  private val viewModel: EditProductsSuccessfulVM by viewModels<EditProductsSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editProductsSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_PRODUCTS_SUCCESSFUL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditProductsSuccessfulActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

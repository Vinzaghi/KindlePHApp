package com.kindleapp.app.modules.editproducts.ui

import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityEditProductsBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.editproducts.`data`.viewmodel.EditProductsVM
import com.kindleapp.app.modules.editproductssuccessful.ui.EditProductsSuccessfulActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import kotlin.String
import kotlin.Unit

class EditProductsActivity :
    BaseActivity<ActivityEditProductsBinding>(R.layout.activity_edit_products) {
  private val viewModel: EditProductsVM by viewModels<EditProductsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editProductsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
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
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = EditProductsSuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_PRODUCTS_ACTIVITY"

  }
}

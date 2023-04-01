package com.kindleapp.app.modules.myproductsafterdelete.ui

import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityMyProductsAfterDeleteBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.createnewproduct.ui.CreateNewProductActivity
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.myproductsafterdelete.`data`.model.ListkindlecandlebRowModel
import com.kindleapp.app.modules.myproductsafterdelete.`data`.viewmodel.MyProductsAfterDeleteVM
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyProductsAfterDeleteActivity :
    BaseActivity<ActivityMyProductsAfterDeleteBinding>(R.layout.activity_my_products_after_delete) {
  private val viewModel: MyProductsAfterDeleteVM by viewModels<MyProductsAfterDeleteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listkindlecandlebAdapter =
    ListkindlecandlebAdapter(viewModel.listkindlecandlebList.value?:mutableListOf())
    binding.recyclerListkindlecandleb.adapter = listkindlecandlebAdapter
    listkindlecandlebAdapter.setOnItemClickListener(
    object : ListkindlecandlebAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListkindlecandlebRowModel) {
        onClickRecyclerListkindlecandleb(view, position, item)
      }
    }
    )
    viewModel.listkindlecandlebList.observe(this) {
      listkindlecandlebAdapter.updateData(it)
    }
    binding.myProductsAfterDeleteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageTotalSales.setOnClickListener {
      val destIntent = MySalesActivity.getIntent(this, null)
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
    binding.linearRowplus.setOnClickListener {
      val destIntent = CreateNewProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListkindlecandleb(
    view: View,
    position: Int,
    item: ListkindlecandlebRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_PRODUCTS_AFTER_DELETE_ACTIVITY"

  }
}

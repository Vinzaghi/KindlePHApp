package com.kindleapp.app.modules.myproducts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityMyProductsBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.createnewproduct.ui.CreateNewProductActivity
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.delete.ui.DeleteActivity
import com.kindleapp.app.modules.myproducts.`data`.model.ListkindlesoywaxRowModel
import com.kindleapp.app.modules.myproducts.`data`.model.ListkindlesoywaxThreeRowModel
import com.kindleapp.app.modules.myproducts.`data`.viewmodel.MyProductsVM
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyProductsActivity : BaseActivity<ActivityMyProductsBinding>(R.layout.activity_my_products) {
  private val viewModel: MyProductsVM by viewModels<MyProductsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listkindlesoywaxAdapter =
    ListkindlesoywaxAdapter(viewModel.listkindlesoywaxList.value?:mutableListOf())
    binding.recyclerListkindlesoywax.adapter = listkindlesoywaxAdapter
    listkindlesoywaxAdapter.setOnItemClickListener(
    object : ListkindlesoywaxAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListkindlesoywaxRowModel) {
        onClickRecyclerListkindlesoywax(view, position, item)
      }
    }
    )
    viewModel.listkindlesoywaxList.observe(this) {
      listkindlesoywaxAdapter.updateData(it)
    }
    val listkindlesoywaxThreeAdapter =
    ListkindlesoywaxThreeAdapter(viewModel.listkindlesoywaxThreeList.value?:mutableListOf())
    binding.recyclerListkindlesoywaxThree.adapter = listkindlesoywaxThreeAdapter
    listkindlesoywaxThreeAdapter.setOnItemClickListener(
    object : ListkindlesoywaxThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListkindlesoywaxThreeRowModel) {
        onClickRecyclerListkindlesoywaxThree(view, position, item)
      }
    }
    )
    viewModel.listkindlesoywaxThreeList.observe(this) {
      listkindlesoywaxThreeAdapter.updateData(it)
    }
    binding.myProductsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageTotalSales.setOnClickListener {
      val destIntent = MySalesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowplus.setOnClickListener {
      val destIntent = CreateNewProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListkindlesoywax(
    view: View,
    position: Int,
    item: ListkindlesoywaxRowModel
  ): Unit {
    when(view.id) {
      R.id.txtGroup8799 -> {
        val destIntent = DeleteActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  fun onClickRecyclerListkindlesoywaxThree(
    view: View,
    position: Int,
    item: ListkindlesoywaxThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_PRODUCTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyProductsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.kindleapp.app.modules.succesfulfeaturedcreate.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivitySuccesfulFeaturedCreateBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import com.kindleapp.app.modules.previewforusers.ui.PreviewForUsersActivity
import com.kindleapp.app.modules.succesfulfeaturedcreate.`data`.model.Gridplus1RowModel
import com.kindleapp.app.modules.succesfulfeaturedcreate.`data`.viewmodel.SuccesfulFeaturedCreateVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SuccesfulFeaturedCreateActivity :
    BaseActivity<ActivitySuccesfulFeaturedCreateBinding>(R.layout.activity_succesful_featured_create)
    {
  private val viewModel: SuccesfulFeaturedCreateVM by viewModels<SuccesfulFeaturedCreateVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridplusAdapter = GridplusAdapter(viewModel.gridplusList.value?:mutableListOf())
    binding.recyclerGridplus.adapter = gridplusAdapter
    gridplusAdapter.setOnItemClickListener(
    object : GridplusAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridplus1RowModel) {
        onClickRecyclerGridplus(view, position, item)
      }
    }
    )
    viewModel.gridplusList.observe(this) {
      gridplusAdapter.updateData(it)
    }
    binding.succesfulFeaturedCreateVM = viewModel
  }

  override fun setUpClicks(): Unit {
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
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnHomepagePreviewOne.setOnClickListener {
      val destIntent = PreviewForUsersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerGridplus(
    view: View,
    position: Int,
    item: Gridplus1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SUCCESFUL_FEATURED_CREATE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SuccesfulFeaturedCreateActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

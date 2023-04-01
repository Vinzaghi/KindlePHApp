package com.kindleapp.app.modules.createnewfeaturedproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityCreateNewFeaturedProductBinding
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.createnewfeaturedproduct.`data`.model.GridplusRowModel
import com.kindleapp.app.modules.createnewfeaturedproduct.`data`.viewmodel.CreateNewFeaturedProductVM
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import com.kindleapp.app.modules.previewforusers.ui.PreviewForUsersActivity
import com.kindleapp.app.modules.succesfulfeaturedcreate.ui.SuccesfulFeaturedCreateActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CreateNewFeaturedProductActivity :
    BaseActivity<ActivityCreateNewFeaturedProductBinding>(R.layout.activity_create_new_featured_product)
    {
  private val viewModel: CreateNewFeaturedProductVM by viewModels<CreateNewFeaturedProductVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridplusAdapter = GridplusAdapter(viewModel.gridplusList.value?:mutableListOf())
    binding.recyclerGridplus.adapter = gridplusAdapter
    gridplusAdapter.setOnItemClickListener(
    object : GridplusAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridplusRowModel) {
        onClickRecyclerGridplus(view, position, item)
      }
    }
    )
    viewModel.gridplusList.observe(this) {
      gridplusAdapter.updateData(it)
    }
    binding.createNewFeaturedProductVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnHomepagePreviewOne.setOnClickListener {
      val destIntent = PreviewForUsersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
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
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCreate.setOnClickListener {
      val destIntent = SuccesfulFeaturedCreateActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridplus(
    view: View,
    position: Int,
    item: GridplusRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CREATE_NEW_FEATURED_PRODUCT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateNewFeaturedProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.kindleapp.app.modules.delete.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityDeleteBinding
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.delete.`data`.model.Listkindlesoywax1RowModel
import com.kindleapp.app.modules.delete.`data`.model.ListkindlesoywaxOneRowModel
import com.kindleapp.app.modules.delete.`data`.model.ListkindlesoywaxThree1RowModel
import com.kindleapp.app.modules.delete.`data`.viewmodel.DeleteVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DeleteActivity : BaseActivity<ActivityDeleteBinding>(R.layout.activity_delete) {
  private val viewModel: DeleteVM by viewModels<DeleteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listkindlesoywaxAdapter =
    ListkindlesoywaxAdapter(viewModel.listkindlesoywaxList.value?:mutableListOf())
    binding.recyclerListkindlesoywax.adapter = listkindlesoywaxAdapter
    listkindlesoywaxAdapter.setOnItemClickListener(
    object : ListkindlesoywaxAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listkindlesoywax1RowModel) {
        onClickRecyclerListkindlesoywax(view, position, item)
      }
    }
    )
    viewModel.listkindlesoywaxList.observe(this) {
      listkindlesoywaxAdapter.updateData(it)
    }
    val listkindlesoywaxOneAdapter =
    ListkindlesoywaxOneAdapter(viewModel.listkindlesoywaxOneList.value?:mutableListOf())
    binding.recyclerListkindlesoywaxOne.adapter = listkindlesoywaxOneAdapter
    listkindlesoywaxOneAdapter.setOnItemClickListener(
    object : ListkindlesoywaxOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListkindlesoywaxOneRowModel) {
        onClickRecyclerListkindlesoywaxOne(view, position, item)
      }
    }
    )
    viewModel.listkindlesoywaxOneList.observe(this) {
      listkindlesoywaxOneAdapter.updateData(it)
    }
    val listkindlesoywaxThreeAdapter =
    ListkindlesoywaxThreeAdapter(viewModel.listkindlesoywaxThreeList.value?:mutableListOf())
    binding.recyclerListkindlesoywaxThree.adapter = listkindlesoywaxThreeAdapter
    listkindlesoywaxThreeAdapter.setOnItemClickListener(
    object : ListkindlesoywaxThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListkindlesoywaxThree1RowModel) {
        onClickRecyclerListkindlesoywaxThree(view, position, item)
      }
    }
    )
    viewModel.listkindlesoywaxThreeList.observe(this) {
      listkindlesoywaxThreeAdapter.updateData(it)
    }
    binding.deleteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHomePage.setOnClickListener {
      val destIntent = DashboardHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListkindlesoywax(
    view: View,
    position: Int,
    item: Listkindlesoywax1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListkindlesoywaxOne(
    view: View,
    position: Int,
    item: ListkindlesoywaxOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListkindlesoywaxThree(
    view: View,
    position: Int,
    item: ListkindlesoywaxThree1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DELETE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DeleteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

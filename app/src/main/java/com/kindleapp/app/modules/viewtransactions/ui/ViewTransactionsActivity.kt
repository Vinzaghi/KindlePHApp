package com.kindleapp.app.modules.viewtransactions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityViewTransactionsBinding
import com.kindleapp.app.modules.filterbutton.ui.FilterButtonActivity
import com.kindleapp.app.modules.viewtransactions.`data`.model.ListlolRowModel
import com.kindleapp.app.modules.viewtransactions.`data`.viewmodel.ViewTransactionsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ViewTransactionsActivity :
    BaseActivity<ActivityViewTransactionsBinding>(R.layout.activity_view_transactions) {
  private val viewModel: ViewTransactionsVM by viewModels<ViewTransactionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlolAdapter = ListlolAdapter(viewModel.listlolList.value?:mutableListOf())
    binding.recyclerListlol.adapter = listlolAdapter
    listlolAdapter.setOnItemClickListener(
    object : ListlolAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlolRowModel) {
        onClickRecyclerListlol(view, position, item)
      }
    }
    )
    viewModel.listlolList.observe(this) {
      listlolAdapter.updateData(it)
    }
    binding.viewTransactionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageSettings.setOnClickListener {
      val destIntent = FilterButtonActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListlol(
    view: View,
    position: Int,
    item: ListlolRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VIEW_TRANSACTIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ViewTransactionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

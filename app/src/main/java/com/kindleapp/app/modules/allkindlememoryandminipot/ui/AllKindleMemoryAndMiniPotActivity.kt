package com.kindleapp.app.modules.allkindlememoryandminipot.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAllKindleMemoryAndMiniPotBinding
import com.kindleapp.app.modules.allkindlememoryandminipot.`data`.model.Toreceive2RowModel
import com.kindleapp.app.modules.allkindlememoryandminipot.`data`.viewmodel.AllKindleMemoryAndMiniPotVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AllKindleMemoryAndMiniPotActivity :
    BaseActivity<ActivityAllKindleMemoryAndMiniPotBinding>(R.layout.activity_all_kindle_memory_and_mini_pot)
    {
  private val viewModel: AllKindleMemoryAndMiniPotVM by viewModels<AllKindleMemoryAndMiniPotVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val toReceiveAdapter = ToReceiveAdapter(viewModel.toReceiveList.value?:mutableListOf())
    binding.recyclerToReceive.adapter = toReceiveAdapter
    toReceiveAdapter.setOnItemClickListener(
    object : ToReceiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Toreceive2RowModel) {
        onClickRecyclerToReceive(view, position, item)
      }
    }
    )
    viewModel.toReceiveList.observe(this) {
      toReceiveAdapter.updateData(it)
    }
    binding.allKindleMemoryAndMiniPotVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerToReceive(
    view: View,
    position: Int,
    item: Toreceive2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ALL_KINDLE_MEMORY_AND_MINI_POT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AllKindleMemoryAndMiniPotActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

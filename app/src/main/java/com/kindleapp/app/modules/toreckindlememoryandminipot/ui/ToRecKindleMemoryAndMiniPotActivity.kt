package com.kindleapp.app.modules.toreckindlememoryandminipot.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityToRecKindleMemoryAndMiniPotBinding
import com.kindleapp.app.modules.toreckindlememoryandminipot.`data`.model.ToreceiveRowModel
import com.kindleapp.app.modules.toreckindlememoryandminipot.`data`.viewmodel.ToRecKindleMemoryAndMiniPotVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ToRecKindleMemoryAndMiniPotActivity :
    BaseActivity<ActivityToRecKindleMemoryAndMiniPotBinding>(R.layout.activity_to_rec_kindle_memory_and_mini_pot)
    {
  private val viewModel: ToRecKindleMemoryAndMiniPotVM by
      viewModels<ToRecKindleMemoryAndMiniPotVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val toReceiveAdapter = ToReceiveAdapter(viewModel.toReceiveList.value?:mutableListOf())
    binding.recyclerToReceive.adapter = toReceiveAdapter
    toReceiveAdapter.setOnItemClickListener(
    object : ToReceiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ToreceiveRowModel) {
        onClickRecyclerToReceive(view, position, item)
      }
    }
    )
    viewModel.toReceiveList.observe(this) {
      toReceiveAdapter.updateData(it)
    }
    binding.toRecKindleMemoryAndMiniPotVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerToReceive(
    view: View,
    position: Int,
    item: ToreceiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TO_REC_KINDLE_MEMORY_AND_MINI_POT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ToRecKindleMemoryAndMiniPotActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

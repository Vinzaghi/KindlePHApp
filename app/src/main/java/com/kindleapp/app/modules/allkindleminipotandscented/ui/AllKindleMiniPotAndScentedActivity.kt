package com.kindleapp.app.modules.allkindleminipotandscented.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAllKindleMiniPotAndScentedBinding
import com.kindleapp.app.modules.allkindleminipotandscented.`data`.model.Toreceive3RowModel
import com.kindleapp.app.modules.allkindleminipotandscented.`data`.viewmodel.AllKindleMiniPotAndScentedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AllKindleMiniPotAndScentedActivity :
    BaseActivity<ActivityAllKindleMiniPotAndScentedBinding>(R.layout.activity_all_kindle_mini_pot_and_scented)
    {
  private val viewModel: AllKindleMiniPotAndScentedVM by viewModels<AllKindleMiniPotAndScentedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val toReceiveAdapter = ToReceiveAdapter(viewModel.toReceiveList.value?:mutableListOf())
    binding.recyclerToReceive.adapter = toReceiveAdapter
    toReceiveAdapter.setOnItemClickListener(
    object : ToReceiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Toreceive3RowModel) {
        onClickRecyclerToReceive(view, position, item)
      }
    }
    )
    viewModel.toReceiveList.observe(this) {
      toReceiveAdapter.updateData(it)
    }
    binding.allKindleMiniPotAndScentedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerToReceive(
    view: View,
    position: Int,
    item: Toreceive3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ALL_KINDLE_MINI_POT_AND_SCENTED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AllKindleMiniPotAndScentedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

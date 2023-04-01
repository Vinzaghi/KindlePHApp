package com.kindleapp.app.modules.reckindleminipotandscented.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityRecKindleMiniPotAndScentedBinding
import com.kindleapp.app.modules.reckindleminipotandscented.`data`.model.Toreceive1RowModel
import com.kindleapp.app.modules.reckindleminipotandscented.`data`.viewmodel.RecKindleMiniPotAndScentedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecKindleMiniPotAndScentedActivity :
    BaseActivity<ActivityRecKindleMiniPotAndScentedBinding>(R.layout.activity_rec_kindle_mini_pot_and_scented)
    {
  private val viewModel: RecKindleMiniPotAndScentedVM by viewModels<RecKindleMiniPotAndScentedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val toReceiveAdapter = ToReceiveAdapter(viewModel.toReceiveList.value?:mutableListOf())
    binding.recyclerToReceive.adapter = toReceiveAdapter
    toReceiveAdapter.setOnItemClickListener(
    object : ToReceiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Toreceive1RowModel) {
        onClickRecyclerToReceive(view, position, item)
      }
    }
    )
    viewModel.toReceiveList.observe(this) {
      toReceiveAdapter.updateData(it)
    }
    binding.recKindleMiniPotAndScentedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerToReceive(
    view: View,
    position: Int,
    item: Toreceive1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REC_KINDLE_MINI_POT_AND_SCENTED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecKindleMiniPotAndScentedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

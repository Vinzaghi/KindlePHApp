package com.kindleapp.app.modules.usermyorderstoreceivetab.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentUserMyOrdersToReceiveTabBinding
import com.kindleapp.app.modules.toreckindlememoryandminipot.ui.ToRecKindleMemoryAndMiniPotActivity
import com.kindleapp.app.modules.usermyorderstoreceivetab.`data`.model.Listkindlememoryc1RowModel
import com.kindleapp.app.modules.usermyorderstoreceivetab.`data`.viewmodel.UserMyOrdersToReceiveTabVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UserMyOrdersToReceiveTabFragment :
    BaseFragment<FragmentUserMyOrdersToReceiveTabBinding>(R.layout.fragment_user_my_orders_to_receive_tab)
    {
  private val viewModel: UserMyOrdersToReceiveTabVM by viewModels<UserMyOrdersToReceiveTabVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listkindlememorycAdapter =
    ListkindlememorycAdapter(viewModel.listkindlememorycList.value?:mutableListOf())
    binding.recyclerListkindlememoryc.adapter = listkindlememorycAdapter
    listkindlememorycAdapter.setOnItemClickListener(
    object : ListkindlememorycAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listkindlememoryc1RowModel) {
        onClickRecyclerListkindlememoryc(view, position, item)
      }
    }
    )
    viewModel.listkindlememorycList.observe(requireActivity()) {
      listkindlememorycAdapter.updateData(it)
    }
    binding.userMyOrdersToReceiveTabVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearToReceive.setOnClickListener {
      val destIntent = ToRecKindleMemoryAndMiniPotActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListkindlememoryc(
    view: View,
    position: Int,
    item: Listkindlememoryc1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "USER_MY_ORDERS_TO_RECEIVE_TAB_FRAGMENT"

  }
}

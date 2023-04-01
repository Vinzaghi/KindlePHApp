package com.kindleapp.app.modules.usermyordersalltab.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentUserMyOrdersAllTabBinding
import com.kindleapp.app.modules.addedtocart.ui.AddedToCartActivity
import com.kindleapp.app.modules.allkindlememoryandminipot.ui.AllKindleMemoryAndMiniPotActivity
import com.kindleapp.app.modules.allkindleminipotandscented.ui.AllKindleMiniPotAndScentedActivity
import com.kindleapp.app.modules.allkindleminipotscentedsoycandles.ui.AllKindleMiniPotScentedSoyCandlesActivity
import com.kindleapp.app.modules.allkindlescentedsoywaxmelts.ui.AllKindleScentedSoyWaxMeltsActivity
import com.kindleapp.app.modules.allkindlescentedsoywaxmeltscancelled.ui.AllKindleScentedSoyWaxMeltsCancelledActivity
import com.kindleapp.app.modules.usermyordersalltab.`data`.model.ListkindlememorycRowModel
import com.kindleapp.app.modules.usermyordersalltab.`data`.model.ListtopayRowModel
import com.kindleapp.app.modules.usermyordersalltab.`data`.viewmodel.UserMyOrdersAllTabVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UserMyOrdersAllTabFragment :
    BaseFragment<FragmentUserMyOrdersAllTabBinding>(R.layout.fragment_user_my_orders_all_tab) {
  private val viewModel: UserMyOrdersAllTabVM by viewModels<UserMyOrdersAllTabVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listtopayAdapter = ListtopayAdapter(viewModel.listtopayList.value?:mutableListOf())
    binding.recyclerListtopay.adapter = listtopayAdapter
    listtopayAdapter.setOnItemClickListener(
    object : ListtopayAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtopayRowModel) {
        onClickRecyclerListtopay(view, position, item)
      }
    }
    )
    viewModel.listtopayList.observe(requireActivity()) {
      listtopayAdapter.updateData(it)
    }
    val listkindlememorycAdapter =
    ListkindlememorycAdapter(viewModel.listkindlememorycList.value?:mutableListOf())
    binding.recyclerListkindlememoryc.adapter = listkindlememorycAdapter
    listkindlememorycAdapter.setOnItemClickListener(
    object : ListkindlememorycAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListkindlememorycRowModel) {
        onClickRecyclerListkindlememoryc(view, position, item)
      }
    }
    )
    viewModel.listkindlememorycList.observe(requireActivity()) {
      listkindlememorycAdapter.updateData(it)
    }
    binding.userMyOrdersAllTabVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBuyAgainOne.setOnClickListener {
      val destIntent = AddedToCartActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowlanguage.setOnClickListener {
      val destIntent = AllKindleMiniPotAndScentedActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearToReceive.setOnClickListener {
      val destIntent = AllKindleMemoryAndMiniPotActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.btnBuyAgain.setOnClickListener {
      val destIntent = AddedToCartActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowcancelled.setOnClickListener {
      val destIntent = AllKindleScentedSoyWaxMeltsCancelledActivity.getIntent(requireActivity(),
          null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListtopay(
    view: View,
    position: Int,
    item: ListtopayRowModel
  ): Unit {
    when(view.id) {
      R.id.linearProduct ->  {
        onClickRecyclerListtopayLinearProduct(view, position, item)
      }
    }
  }

  fun onClickRecyclerListkindlememoryc(
    view: View,
    position: Int,
    item: ListkindlememorycRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtopayLinearProduct(
    view: View,
    position: Int,
    item: ListtopayRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = AllKindleMiniPotScentedSoyCandlesActivity.getIntent(requireActivity(),
            null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
      1 ->  {
        val destIntent = AllKindleScentedSoyWaxMeltsActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "USER_MY_ORDERS_ALL_TAB_FRAGMENT"

  }
}

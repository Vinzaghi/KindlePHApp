package com.kindleapp.app.modules.usermyordersreceivedtab.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentUserMyOrdersReceivedTabBinding
import com.kindleapp.app.modules.addedtocart.ui.AddedToCartActivity
import com.kindleapp.app.modules.reckindleminipotandscented.ui.RecKindleMiniPotAndScentedActivity
import com.kindleapp.app.modules.usermyordersreceivedtab.`data`.viewmodel.UserMyOrdersReceivedTabVM
import kotlin.String
import kotlin.Unit

class UserMyOrdersReceivedTabFragment :
    BaseFragment<FragmentUserMyOrdersReceivedTabBinding>(R.layout.fragment_user_my_orders_received_tab)
    {
  private val viewModel: UserMyOrdersReceivedTabVM by viewModels<UserMyOrdersReceivedTabVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.userMyOrdersReceivedTabVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowlanguage.setOnClickListener {
      val destIntent = RecKindleMiniPotAndScentedActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.txtBuyagainBtn.setOnClickListener {
      val destIntent = AddedToCartActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "USER_MY_ORDERS_RECEIVED_TAB_FRAGMENT"

  }
}

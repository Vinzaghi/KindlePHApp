package com.kindleapp.app.modules.usermyorderstopaytab.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentUserMyOrdersToPayTabBinding
import com.kindleapp.app.modules.paykindleminipotscentedsoycandles.ui.PayKindleMiniPotScentedSoyCandlesActivity
import com.kindleapp.app.modules.usermyorderstopaytab.`data`.viewmodel.UserMyOrdersToPayTabVM
import kotlin.String
import kotlin.Unit

class UserMyOrdersToPayTabFragment :
    BaseFragment<FragmentUserMyOrdersToPayTabBinding>(R.layout.fragment_user_my_orders_to_pay_tab) {
  private val viewModel: UserMyOrdersToPayTabVM by viewModels<UserMyOrdersToPayTabVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.userMyOrdersToPayTabVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearProduct4.setOnClickListener {
      val destIntent = PayKindleMiniPotScentedSoyCandlesActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "USER_MY_ORDERS_TO_PAY_TAB_FRAGMENT"

  }
}

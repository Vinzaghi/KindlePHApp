package com.kindleapp.app.modules.usermyorderstoshiptab.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentUserMyOrdersToShipTabBinding
import com.kindleapp.app.modules.shipkindlescentedsoywaxmelts.ui.ShipKindleScentedSoyWaxMeltsActivity
import com.kindleapp.app.modules.usermyorderstoshiptab.`data`.viewmodel.UserMyOrdersToShipTabVM
import kotlin.String
import kotlin.Unit

class UserMyOrdersToShipTabFragment :
    BaseFragment<FragmentUserMyOrdersToShipTabBinding>(R.layout.fragment_user_my_orders_to_ship_tab)
    {
  private val viewModel: UserMyOrdersToShipTabVM by viewModels<UserMyOrdersToShipTabVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.userMyOrdersToShipTabVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearProduct4.setOnClickListener {
      val destIntent = ShipKindleScentedSoyWaxMeltsActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "USER_MY_ORDERS_TO_SHIP_TAB_FRAGMENT"

  }
}

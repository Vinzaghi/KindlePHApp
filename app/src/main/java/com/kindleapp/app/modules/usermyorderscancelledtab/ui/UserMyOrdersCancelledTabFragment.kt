package com.kindleapp.app.modules.usermyorderscancelledtab.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentUserMyOrdersCancelledTabBinding
import com.kindleapp.app.modules.addedtocart.ui.AddedToCartActivity
import com.kindleapp.app.modules.cankindlescentedsoywaxmeltscancelled.ui.CanKindleScentedSoyWaxMeltsCancelledActivity
import com.kindleapp.app.modules.usermyorderscancelledtab.`data`.viewmodel.UserMyOrdersCancelledTabVM
import kotlin.String
import kotlin.Unit

class UserMyOrdersCancelledTabFragment :
    BaseFragment<FragmentUserMyOrdersCancelledTabBinding>(R.layout.fragment_user_my_orders_cancelled_tab)
    {
  private val viewModel: UserMyOrdersCancelledTabVM by viewModels<UserMyOrdersCancelledTabVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.userMyOrdersCancelledTabVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowcancelled.setOnClickListener {
      val destIntent = CanKindleScentedSoyWaxMeltsCancelledActivity.getIntent(requireActivity(),
          null)
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
    const val TAG: String = "USER_MY_ORDERS_CANCELLED_TAB_FRAGMENT"

  }
}

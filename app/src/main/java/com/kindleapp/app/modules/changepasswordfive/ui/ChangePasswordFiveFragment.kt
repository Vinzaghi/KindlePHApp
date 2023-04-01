package com.kindleapp.app.modules.changepasswordfive.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentChangePasswordFiveBinding
import com.kindleapp.app.modules.changepasswordfive.`data`.viewmodel.ChangePasswordFiveVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ChangePasswordFiveFragment :
    BaseFragment<FragmentChangePasswordFiveBinding>(R.layout.fragment_change_password_five) {
  private val viewModel: ChangePasswordFiveVM by viewModels<ChangePasswordFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.changePasswordFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "CHANGE_PASSWORD_FIVE_FRAGMENT"

  }
}

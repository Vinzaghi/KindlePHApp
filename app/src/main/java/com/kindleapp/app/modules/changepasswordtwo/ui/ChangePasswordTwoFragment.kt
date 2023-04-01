package com.kindleapp.app.modules.changepasswordtwo.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentChangePasswordTwoBinding
import com.kindleapp.app.modules.changepasswordtwo.`data`.viewmodel.ChangePasswordTwoVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ChangePasswordTwoFragment :
    BaseFragment<FragmentChangePasswordTwoBinding>(R.layout.fragment_change_password_two) {
  private val viewModel: ChangePasswordTwoVM by viewModels<ChangePasswordTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.changePasswordTwoVM = viewModel
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
    const val TAG: String = "CHANGE_PASSWORD_TWO_FRAGMENT"

  }
}

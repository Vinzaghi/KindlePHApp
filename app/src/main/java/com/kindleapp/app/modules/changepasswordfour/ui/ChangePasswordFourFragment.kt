package com.kindleapp.app.modules.changepasswordfour.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentChangePasswordFourBinding
import com.kindleapp.app.modules.changepasswordfour.`data`.viewmodel.ChangePasswordFourVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ChangePasswordFourFragment :
    BaseFragment<FragmentChangePasswordFourBinding>(R.layout.fragment_change_password_four) {
  private val viewModel: ChangePasswordFourVM by viewModels<ChangePasswordFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.changePasswordFourVM = viewModel
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
    const val TAG: String = "CHANGE_PASSWORD_FOUR_FRAGMENT"

  }
}

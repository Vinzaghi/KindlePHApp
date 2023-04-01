package com.kindleapp.app.modules.changepassword.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentChangePasswordBinding
import com.kindleapp.app.modules.changepassword.`data`.viewmodel.ChangePasswordVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ChangePasswordFragment :
    BaseFragment<FragmentChangePasswordBinding>(R.layout.fragment_change_password) {
  private val viewModel: ChangePasswordVM by viewModels<ChangePasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.changePasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "CHANGE_PASSWORD_FRAGMENT"

  }
}

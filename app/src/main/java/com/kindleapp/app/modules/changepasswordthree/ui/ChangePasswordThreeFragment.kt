package com.kindleapp.app.modules.changepasswordthree.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentChangePasswordThreeBinding
import com.kindleapp.app.modules.changepasswordthree.`data`.viewmodel.ChangePasswordThreeVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ChangePasswordThreeFragment :
    BaseFragment<FragmentChangePasswordThreeBinding>(R.layout.fragment_change_password_three) {
  private val viewModel: ChangePasswordThreeVM by viewModels<ChangePasswordThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.changePasswordThreeVM = viewModel
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
    const val TAG: String = "CHANGE_PASSWORD_THREE_FRAGMENT"

  }
}

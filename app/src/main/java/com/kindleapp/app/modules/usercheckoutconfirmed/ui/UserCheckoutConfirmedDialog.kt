package com.kindleapp.app.modules.usercheckoutconfirmed.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseDialogFragment
import com.kindleapp.app.databinding.DialogUserCheckoutConfirmedBinding
import com.kindleapp.app.modules.usercheckoutconfirmed.`data`.viewmodel.UserCheckoutConfirmedVM
import kotlin.String
import kotlin.Unit

class UserCheckoutConfirmedDialog :
    BaseDialogFragment<DialogUserCheckoutConfirmedBinding>(R.layout.dialog_user_checkout_confirmed)
    {
  private val viewModel: UserCheckoutConfirmedVM by viewModels<UserCheckoutConfirmedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.userCheckoutConfirmedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "USER_CHECKOUT_CONFIRMED_DIALOG"


    fun getInstance(bundle: Bundle?): UserCheckoutConfirmedDialog {
      val fragment = UserCheckoutConfirmedDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}

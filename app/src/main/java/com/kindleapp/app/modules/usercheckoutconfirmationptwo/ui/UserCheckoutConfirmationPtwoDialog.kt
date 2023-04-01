package com.kindleapp.app.modules.usercheckoutconfirmationptwo.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseDialogFragment
import com.kindleapp.app.databinding.DialogUserCheckoutConfirmationPtwoBinding
import com.kindleapp.app.modules.usercheckoutconfirmationptwo.`data`.viewmodel.UserCheckoutConfirmationPtwoVM
import com.kindleapp.app.modules.usercheckoutconfirmed.ui.UserCheckoutConfirmedDialog
import kotlin.String
import kotlin.Unit

class UserCheckoutConfirmationPtwoDialog :
    BaseDialogFragment<DialogUserCheckoutConfirmationPtwoBinding>(R.layout.dialog_user_checkout_confirmation_ptwo)
    {
  private val viewModel: UserCheckoutConfirmationPtwoVM by
      viewModels<UserCheckoutConfirmationPtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.userCheckoutConfirmationPtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirm.setOnClickListener {
      val destFragment = UserCheckoutConfirmedDialog.getInstance(null)
      destFragment.show(requireActivity().supportFragmentManager, UserCheckoutConfirmedDialog.TAG)
    }
    binding.btnCancel.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "USER_CHECKOUT_CONFIRMATION_PTWO_DIALOG"


    fun getInstance(bundle: Bundle?): UserCheckoutConfirmationPtwoDialog {
      val fragment = UserCheckoutConfirmationPtwoDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}

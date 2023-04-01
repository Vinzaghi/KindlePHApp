package com.kindleapp.app.modules.paymentdebitcredit.ui

import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityPaymentDebitCreditBinding
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.paymentdebitcredit.`data`.viewmodel.PaymentDebitCreditVM
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class PaymentDebitCreditActivity :
    BaseActivity<ActivityPaymentDebitCreditBinding>(R.layout.activity_payment_debit_credit) {
  private val viewModel: PaymentDebitCreditVM by viewModels<PaymentDebitCreditVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.paymentDebitCreditVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_DEBIT_CREDIT_ACTIVITY"

  }
}

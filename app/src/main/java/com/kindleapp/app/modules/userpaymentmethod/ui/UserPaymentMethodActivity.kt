package com.kindleapp.app.modules.userpaymentmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityUserPaymentMethodBinding
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.paymentmenu.ui.PaymentMenuActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import com.kindleapp.app.modules.userpaymentmethod.`data`.viewmodel.UserPaymentMethodVM
import kotlin.String
import kotlin.Unit

class UserPaymentMethodActivity :
    BaseActivity<ActivityUserPaymentMethodBinding>(R.layout.activity_user_payment_method) {
  private val viewModel: UserPaymentMethodVM by viewModels<UserPaymentMethodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userPaymentMethodVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAddPaymentMethod.setOnClickListener {
      val destIntent = PaymentMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "USER_PAYMENT_METHOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserPaymentMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

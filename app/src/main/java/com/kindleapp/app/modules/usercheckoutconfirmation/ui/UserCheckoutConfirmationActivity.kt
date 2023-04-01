package com.kindleapp.app.modules.usercheckoutconfirmation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityUserCheckoutConfirmationBinding
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import com.kindleapp.app.modules.usercheckoutconfirmation.`data`.viewmodel.UserCheckoutConfirmationVM
import com.kindleapp.app.modules.usercheckoutconfirmationptwo.ui.UserCheckoutConfirmationPtwoDialog
import kotlin.String
import kotlin.Unit

class UserCheckoutConfirmationActivity :
    BaseActivity<ActivityUserCheckoutConfirmationBinding>(R.layout.activity_user_checkout_confirmation)
    {
  private val viewModel: UserCheckoutConfirmationVM by viewModels<UserCheckoutConfirmationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userCheckoutConfirmationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnPlaceOrder.setOnClickListener {
      val destFragment = UserCheckoutConfirmationPtwoDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, UserCheckoutConfirmationPtwoDialog.TAG)
    }
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "USER_CHECKOUT_CONFIRMATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserCheckoutConfirmationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

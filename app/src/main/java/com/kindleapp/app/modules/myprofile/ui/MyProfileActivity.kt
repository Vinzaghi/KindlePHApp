package com.kindleapp.app.modules.myprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityMyProfileBinding
import com.kindleapp.app.modules.aboutpage.ui.AboutPageActivity
import com.kindleapp.app.modules.customerfeedback.ui.CustomerFeedbackActivity
import com.kindleapp.app.modules.myprofile.`data`.viewmodel.MyProfileVM
import com.kindleapp.app.modules.personalinformation.ui.PersonalInformationActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import com.kindleapp.app.modules.usercheckoutconfirmationptwo.ui.UserCheckoutConfirmationPtwoDialog
import com.kindleapp.app.modules.userpaymentmethod.ui.UserPaymentMethodActivity
import kotlin.String
import kotlin.Unit

class MyProfileActivity : BaseActivity<ActivityMyProfileBinding>(R.layout.activity_my_profile) {
  private val viewModel: MyProfileVM by viewModels<MyProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destFragment = UserCheckoutConfirmationPtwoDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, UserCheckoutConfirmationPtwoDialog.TAG)
    }
    binding.btnLogOut.setOnClickListener {
      val destFragment = UserCheckoutConfirmationPtwoDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, UserCheckoutConfirmationPtwoDialog.TAG)
    }
    binding.linearPaymentMethods.setOnClickListener {
      val destIntent = UserPaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFeedback.setOnClickListener {
      val destIntent = CustomerFeedbackActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBITBIT.setOnClickListener {
      val destIntent = AboutPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPersonalInform.setOnClickListener {
      val destIntent = PersonalInformationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MY_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

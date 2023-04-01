package com.kindleapp.app.modules.customerfeedback.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityCustomerFeedbackBinding
import com.kindleapp.app.modules.customerfeedback.`data`.viewmodel.CustomerFeedbackVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class CustomerFeedbackActivity :
    BaseActivity<ActivityCustomerFeedbackBinding>(R.layout.activity_customer_feedback) {
  private val viewModel: CustomerFeedbackVM by viewModels<CustomerFeedbackVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.customerFeedbackVM = viewModel
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
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CUSTOMER_FEEDBACK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CustomerFeedbackActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

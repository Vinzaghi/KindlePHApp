package com.kindleapp.app.modules.addedtocart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAddedToCartBinding
import com.kindleapp.app.modules.addedtocart.`data`.viewmodel.AddedToCartVM
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class AddedToCartActivity :
    BaseActivity<ActivityAddedToCartBinding>(R.layout.activity_added_to_cart) {
  private val viewModel: AddedToCartVM by viewModels<AddedToCartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addedToCartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnViewMyCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADDED_TO_CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddedToCartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

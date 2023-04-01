package com.kindleapp.app.modules.item5cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityItem5CartBinding
import com.kindleapp.app.modules.addedtocart.ui.AddedToCartActivity
import com.kindleapp.app.modules.item5cart.`data`.viewmodel.Item5CartVM
import kotlin.String
import kotlin.Unit

class Item5CartActivity : BaseActivity<ActivityItem5CartBinding>(R.layout.activity_item_5_cart) {
  private val viewModel: Item5CartVM by viewModels<Item5CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.item5CartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAddToCart.setOnClickListener {
      val destIntent = AddedToCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ITEM5CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Item5CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

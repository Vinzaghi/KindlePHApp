package com.kindleapp.app.modules.item2cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityItem2CartBinding
import com.kindleapp.app.modules.addedtocart.ui.AddedToCartActivity
import com.kindleapp.app.modules.item2cart.`data`.viewmodel.Item2CartVM
import kotlin.String
import kotlin.Unit

class Item2CartActivity : BaseActivity<ActivityItem2CartBinding>(R.layout.activity_item_2_cart) {
  private val viewModel: Item2CartVM by viewModels<Item2CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.item2CartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAddToCart.setOnClickListener {
      val destIntent = AddedToCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ITEM2CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Item2CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

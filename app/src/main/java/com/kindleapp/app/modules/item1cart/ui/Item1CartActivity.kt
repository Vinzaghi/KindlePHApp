package com.kindleapp.app.modules.item1cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityItem1CartBinding
import com.kindleapp.app.modules.addedtocart.ui.AddedToCartActivity
import com.kindleapp.app.modules.item1cart.`data`.viewmodel.Item1CartVM
import kotlin.String
import kotlin.Unit

class Item1CartActivity : BaseActivity<ActivityItem1CartBinding>(R.layout.activity_item_1_cart) {
  private val viewModel: Item1CartVM by viewModels<Item1CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.item1CartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAddToCart.setOnClickListener {
      val destIntent = AddedToCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ITEM1CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Item1CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

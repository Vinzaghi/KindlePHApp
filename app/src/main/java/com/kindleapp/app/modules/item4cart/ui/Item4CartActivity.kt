package com.kindleapp.app.modules.item4cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityItem4CartBinding
import com.kindleapp.app.modules.addedtocart.ui.AddedToCartActivity
import com.kindleapp.app.modules.item4cart.`data`.viewmodel.Item4CartVM
import kotlin.String
import kotlin.Unit

class Item4CartActivity : BaseActivity<ActivityItem4CartBinding>(R.layout.activity_item_4_cart) {
  private val viewModel: Item4CartVM by viewModels<Item4CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.item4CartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAddToCart.setOnClickListener {
      val destIntent = AddedToCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ITEM4CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Item4CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

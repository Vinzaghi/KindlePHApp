package com.kindleapp.app.modules.itemone.ui

import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityItemOneBinding
import com.kindleapp.app.modules.item1cart.ui.Item1CartActivity
import com.kindleapp.app.modules.itemone.`data`.viewmodel.ItemOneVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ItemOneActivity : BaseActivity<ActivityItemOneBinding>(R.layout.activity_item_one) {
  private val viewModel: ItemOneVM by viewModels<ItemOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.itemOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowaddtocart.setOnClickListener {
      val destIntent = Item1CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
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
    const val TAG: String = "ITEM_ONE_ACTIVITY"

  }
}

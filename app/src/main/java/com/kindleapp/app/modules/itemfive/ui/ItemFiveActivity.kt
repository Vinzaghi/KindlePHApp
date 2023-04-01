package com.kindleapp.app.modules.itemfive.ui

import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityItemFiveBinding
import com.kindleapp.app.modules.item5cart.ui.Item5CartActivity
import com.kindleapp.app.modules.itemfive.`data`.viewmodel.ItemFiveVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ItemFiveActivity : BaseActivity<ActivityItemFiveBinding>(R.layout.activity_item_five) {
  private val viewModel: ItemFiveVM by viewModels<ItemFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.itemFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnaddtocart.setOnClickListener {
      val destIntent = Item5CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageShoppingCartOne.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ITEM_FIVE_ACTIVITY"

  }
}

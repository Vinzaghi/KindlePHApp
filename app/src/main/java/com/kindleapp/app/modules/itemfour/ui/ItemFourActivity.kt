package com.kindleapp.app.modules.itemfour.ui

import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityItemFourBinding
import com.kindleapp.app.modules.item4cart.ui.Item4CartActivity
import com.kindleapp.app.modules.itemfour.`data`.viewmodel.ItemFourVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ItemFourActivity : BaseActivity<ActivityItemFourBinding>(R.layout.activity_item_four) {
  private val viewModel: ItemFourVM by viewModels<ItemFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.itemFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageShoppingCartOne.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowaddtocart.setOnClickListener {
      val destIntent = Item4CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ITEM_FOUR_ACTIVITY"

  }
}

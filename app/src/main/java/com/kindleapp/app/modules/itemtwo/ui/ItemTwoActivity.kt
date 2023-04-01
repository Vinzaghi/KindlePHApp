package com.kindleapp.app.modules.itemtwo.ui

import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityItemTwoBinding
import com.kindleapp.app.modules.item2cart.ui.Item2CartActivity
import com.kindleapp.app.modules.itemtwo.`data`.viewmodel.ItemTwoVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ItemTwoActivity : BaseActivity<ActivityItemTwoBinding>(R.layout.activity_item_two) {
  private val viewModel: ItemTwoVM by viewModels<ItemTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.itemTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowaddtocart.setOnClickListener {
      val destIntent = Item2CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageShoppingCartOne.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ITEM_TWO_ACTIVITY"

  }
}

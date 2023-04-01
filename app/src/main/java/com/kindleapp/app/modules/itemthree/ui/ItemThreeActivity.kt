package com.kindleapp.app.modules.itemthree.ui

import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityItemThreeBinding
import com.kindleapp.app.modules.item3cart.ui.Item3CartActivity
import com.kindleapp.app.modules.itemthree.`data`.viewmodel.ItemThreeVM
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class ItemThreeActivity : BaseActivity<ActivityItemThreeBinding>(R.layout.activity_item_three) {
  private val viewModel: ItemThreeVM by viewModels<ItemThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.itemThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtAddtoCart.setOnClickListener {
      val destIntent = Item3CartActivity.getIntent(this, null)
      startActivity(destIntent)
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
    const val TAG: String = "ITEM_THREE_ACTIVITY"

  }
}

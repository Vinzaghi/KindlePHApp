package com.kindleapp.app.modules.usercart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityUserCartBinding
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.usercart.`data`.model.UserCartRowModel
import com.kindleapp.app.modules.usercart.`data`.viewmodel.UserCartVM
import com.kindleapp.app.modules.usercheckoutconfirmation.ui.UserCheckoutConfirmationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UserCartActivity : BaseActivity<ActivityUserCartBinding>(R.layout.activity_user_cart) {
  private val viewModel: UserCartVM by viewModels<UserCartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val userCartAdapter = UserCartAdapter(viewModel.userCartList.value?:mutableListOf())
    binding.recyclerUserCart.adapter = userCartAdapter
    userCartAdapter.setOnItemClickListener(
    object : UserCartAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UserCartRowModel) {
        onClickRecyclerUserCart(view, position, item)
      }
    }
    )
    viewModel.userCartList.observe(this) {
      userCartAdapter.updateData(it)
    }
    binding.userCartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCheckout.setOnClickListener {
      val destIntent = UserCheckoutConfirmationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerUserCart(
    view: View,
    position: Int,
    item: UserCartRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "USER_CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserCartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.kindleapp.app.modules.paymentmenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityPaymentMenuBinding
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.paymentmenu.`data`.model.PaymentMenuRowModel
import com.kindleapp.app.modules.paymentmenu.`data`.viewmodel.PaymentMenuVM
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PaymentMenuActivity : BaseActivity<ActivityPaymentMenuBinding>(R.layout.activity_payment_menu)
    {
  private val viewModel: PaymentMenuVM by viewModels<PaymentMenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val paymentMenuAdapter =
    PaymentMenuAdapter(viewModel.paymentMenuList.value?:mutableListOf())
    binding.recyclerPaymentMenu.adapter = paymentMenuAdapter
    paymentMenuAdapter.setOnItemClickListener(
    object : PaymentMenuAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PaymentMenuRowModel) {
        onClickRecyclerPaymentMenu(view, position, item)
      }
    }
    )
    viewModel.paymentMenuList.observe(this) {
      paymentMenuAdapter.updateData(it)
    }
    binding.paymentMenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPaymentMenu(
    view: View,
    position: Int,
    item: PaymentMenuRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PaymentMenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

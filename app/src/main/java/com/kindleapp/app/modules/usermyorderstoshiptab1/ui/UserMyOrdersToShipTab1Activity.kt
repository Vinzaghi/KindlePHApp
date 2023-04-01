package com.kindleapp.app.modules.usermyorderstoshiptab1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityUserMyOrdersToShipTab1Binding
import com.kindleapp.app.modules.usermyorderstoshiptab1.`data`.viewmodel.UserMyOrdersToShipTab1VM
import kotlin.String
import kotlin.Unit

class UserMyOrdersToShipTab1Activity :
    BaseActivity<ActivityUserMyOrdersToShipTab1Binding>(R.layout.activity_user_my_orders_to_ship_tab1)
    {
  private val viewModel: UserMyOrdersToShipTab1VM by viewModels<UserMyOrdersToShipTab1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userMyOrdersToShipTab1VM = viewModel
    val adapter = UserMyOrdersToShipTab1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup22,binding.viewPagerViewpager) { tab, position ->
      tab.text = UserMyOrdersToShipTab1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "USER_MY_ORDERS_TO_SHIP_TAB1ACTIVITY"

    }
  }

package com.kindleapp.app.modules.usermyorderstoshiptab1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import com.kindleapp.app.modules.usermyordersalltab.ui.UserMyOrdersAllTabFragment
import com.kindleapp.app.modules.usermyorderscancelledtab.ui.UserMyOrdersCancelledTabFragment
import com.kindleapp.app.modules.usermyordersreceivedtab.ui.UserMyOrdersReceivedTabFragment
import com.kindleapp.app.modules.usermyorderstopaytab.ui.UserMyOrdersToPayTabFragment
import com.kindleapp.app.modules.usermyorderstoreceivetab.ui.UserMyOrdersToReceiveTabFragment
import com.kindleapp.app.modules.usermyorderstoshiptab.ui.UserMyOrdersToShipTabFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class UserMyOrdersToShipTab1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_all),MyApp.getInstance().resources.getString(R.string.lbl_to_pay),MyApp.getInstance().resources.getString(R.string.lbl_to_ship),MyApp.getInstance().resources.getString(R.string.lbl_to_receive),MyApp.getInstance().resources.getString(R.string.lbl_received2),MyApp.getInstance().resources.getString(R.string.lbl_cancelled))

        val viewPages: List<Fragment> =
                listOf(UserMyOrdersAllTabFragment(),UserMyOrdersToPayTabFragment(),UserMyOrdersToShipTabFragment(),UserMyOrdersToReceiveTabFragment(),UserMyOrdersReceivedTabFragment(),UserMyOrdersCancelledTabFragment())

    }
}

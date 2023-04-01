package com.kindleapp.app.modules.storepagememory1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import com.kindleapp.app.modules.storepageall.ui.StorePageAllFragment
import com.kindleapp.app.modules.storepagememory.ui.StorePageMemoryFragment
import com.kindleapp.app.modules.storepagescented.ui.StorePageScentedFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class StorePageMemory1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_all),MyApp.getInstance().resources.getString(R.string.lbl_scented_candle),MyApp.getInstance().resources.getString(R.string.lbl_memory_candle))

        val viewPages: List<Fragment> =
                listOf(StorePageAllFragment(),StorePageScentedFragment(),StorePageMemoryFragment())

    }
}

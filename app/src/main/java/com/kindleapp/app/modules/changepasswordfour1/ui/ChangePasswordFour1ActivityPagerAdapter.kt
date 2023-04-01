package com.kindleapp.app.modules.changepasswordfour1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import com.kindleapp.app.modules.changepasswordfour.ui.ChangePasswordFourFragment
import com.kindleapp.app.modules.changepasswordthree.ui.ChangePasswordThreeFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class ChangePasswordFour1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_clear),MyApp.getInstance().resources.getString(R.string.lbl_save))

        val viewPages: List<Fragment> =
                listOf(ChangePasswordFourFragment(),ChangePasswordThreeFragment())

    }
}

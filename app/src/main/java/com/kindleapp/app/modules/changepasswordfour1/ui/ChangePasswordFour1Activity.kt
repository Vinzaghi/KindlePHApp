package com.kindleapp.app.modules.changepasswordfour1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityChangePasswordFour1Binding
import com.kindleapp.app.modules.changepasswordfour1.`data`.viewmodel.ChangePasswordFour1VM
import kotlin.String
import kotlin.Unit

class ChangePasswordFour1Activity :
    BaseActivity<ActivityChangePasswordFour1Binding>(R.layout.activity_change_password_four1) {
  private val viewModel: ChangePasswordFour1VM by viewModels<ChangePasswordFour1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.changePasswordFour1VM = viewModel
    val adapter = ChangePasswordFour1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup328,binding.viewPagerViewpager) { tab, position ->
      tab.text = ChangePasswordFour1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "CHANGE_PASSWORD_FOUR1ACTIVITY"

    }
  }

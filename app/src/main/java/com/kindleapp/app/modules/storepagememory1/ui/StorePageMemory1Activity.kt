package com.kindleapp.app.modules.storepagememory1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityStorePageMemory1Binding
import com.kindleapp.app.modules.storepagememory1.`data`.viewmodel.StorePageMemory1VM
import kotlin.String
import kotlin.Unit

class StorePageMemory1Activity :
    BaseActivity<ActivityStorePageMemory1Binding>(R.layout.activity_store_page_memory1) {
  private val viewModel: StorePageMemory1VM by viewModels<StorePageMemory1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.storePageMemory1VM = viewModel
    val adapter = StorePageMemory1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup355,binding.viewPagerViewpager) { tab, position ->
      tab.text = StorePageMemory1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "STORE_PAGE_MEMORY1ACTIVITY"

    }
  }

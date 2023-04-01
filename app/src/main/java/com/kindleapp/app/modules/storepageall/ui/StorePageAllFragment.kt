package com.kindleapp.app.modules.storepageall.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentStorePageAllBinding
import com.kindleapp.app.modules.storepageall.`data`.viewmodel.StorePageAllVM
import com.kindleapp.app.modules.userhomepage.ui.UserHomePageActivity
import kotlin.String
import kotlin.Unit

class StorePageAllFragment :
    BaseFragment<FragmentStorePageAllBinding>(R.layout.fragment_store_page_all) {
  private val viewModel: StorePageAllVM by viewModels<StorePageAllVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.storePageAllVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHomePage.setOnClickListener {
      val destIntent = UserHomePageActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "STORE_PAGE_ALL_FRAGMENT"

  }
}

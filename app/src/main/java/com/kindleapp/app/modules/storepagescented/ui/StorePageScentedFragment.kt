package com.kindleapp.app.modules.storepagescented.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentStorePageScentedBinding
import com.kindleapp.app.modules.storepagescented.`data`.viewmodel.StorePageScentedVM
import com.kindleapp.app.modules.userhomepage.ui.UserHomePageActivity
import kotlin.String
import kotlin.Unit

class StorePageScentedFragment :
    BaseFragment<FragmentStorePageScentedBinding>(R.layout.fragment_store_page_scented) {
  private val viewModel: StorePageScentedVM by viewModels<StorePageScentedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.storePageScentedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHomePage.setOnClickListener {
      val destIntent = UserHomePageActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "STORE_PAGE_SCENTED_FRAGMENT"

  }
}

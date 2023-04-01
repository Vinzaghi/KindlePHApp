package com.kindleapp.app.modules.storepagememory.ui

import androidx.fragment.app.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseFragment
import com.kindleapp.app.databinding.FragmentStorePageMemoryBinding
import com.kindleapp.app.modules.itemseven.ui.ItemSevenActivity
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.storepagememory.`data`.viewmodel.StorePageMemoryVM
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class StorePageMemoryFragment :
    BaseFragment<FragmentStorePageMemoryBinding>(R.layout.fragment_store_page_memory) {
  private val viewModel: StorePageMemoryVM by viewModels<StorePageMemoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.storePageMemoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageImageSeven.setOnClickListener {
      val destIntent = ItemSevenActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "STORE_PAGE_MEMORY_FRAGMENT"

  }
}

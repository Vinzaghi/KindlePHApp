package com.kindleapp.app.modules.filterbutton.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityFilterButtonBinding
import com.kindleapp.app.modules.filterbutton.`data`.viewmodel.FilterButtonVM
import kotlin.String
import kotlin.Unit

class FilterButtonActivity :
    BaseActivity<ActivityFilterButtonBinding>(R.layout.activity_filter_button) {
  private val viewModel: FilterButtonVM by viewModels<FilterButtonVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filterButtonVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FILTER_BUTTON_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FilterButtonActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

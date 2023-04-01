package com.kindleapp.app.modules.allkindlescentedsoywaxmeltscancelled.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAllKindleScentedSoyWaxMeltsCancelledBinding
import com.kindleapp.app.modules.allkindlescentedsoywaxmeltscancelled.`data`.viewmodel.AllKindleScentedSoyWaxMeltsCancelledVM
import kotlin.String
import kotlin.Unit

class AllKindleScentedSoyWaxMeltsCancelledActivity :
    BaseActivity<ActivityAllKindleScentedSoyWaxMeltsCancelledBinding>(R.layout.activity_all_kindle_scented_soy_wax_melts_cancelled)
    {
  private val viewModel: AllKindleScentedSoyWaxMeltsCancelledVM by
      viewModels<AllKindleScentedSoyWaxMeltsCancelledVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.allKindleScentedSoyWaxMeltsCancelledVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ALL_KINDLE_SCENTED_SOY_WAX_MELTS_CANCELLED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AllKindleScentedSoyWaxMeltsCancelledActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

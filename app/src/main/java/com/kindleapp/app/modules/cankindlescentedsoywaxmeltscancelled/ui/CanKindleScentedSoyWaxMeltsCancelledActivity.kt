package com.kindleapp.app.modules.cankindlescentedsoywaxmeltscancelled.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityCanKindleScentedSoyWaxMeltsCancelledBinding
import com.kindleapp.app.modules.cankindlescentedsoywaxmeltscancelled.`data`.viewmodel.CanKindleScentedSoyWaxMeltsCancelledVM
import kotlin.String
import kotlin.Unit

class CanKindleScentedSoyWaxMeltsCancelledActivity :
    BaseActivity<ActivityCanKindleScentedSoyWaxMeltsCancelledBinding>(R.layout.activity_can_kindle_scented_soy_wax_melts_cancelled)
    {
  private val viewModel: CanKindleScentedSoyWaxMeltsCancelledVM by
      viewModels<CanKindleScentedSoyWaxMeltsCancelledVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.canKindleScentedSoyWaxMeltsCancelledVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CAN_KINDLE_SCENTED_SOY_WAX_MELTS_CANCELLED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CanKindleScentedSoyWaxMeltsCancelledActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

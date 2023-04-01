package com.kindleapp.app.modules.allkindlescentedsoywaxmelts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAllKindleScentedSoyWaxMeltsBinding
import com.kindleapp.app.modules.allkindlescentedsoywaxmelts.`data`.viewmodel.AllKindleScentedSoyWaxMeltsVM
import kotlin.String
import kotlin.Unit

class AllKindleScentedSoyWaxMeltsActivity :
    BaseActivity<ActivityAllKindleScentedSoyWaxMeltsBinding>(R.layout.activity_all_kindle_scented_soy_wax_melts)
    {
  private val viewModel: AllKindleScentedSoyWaxMeltsVM by
      viewModels<AllKindleScentedSoyWaxMeltsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.allKindleScentedSoyWaxMeltsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ALL_KINDLE_SCENTED_SOY_WAX_MELTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AllKindleScentedSoyWaxMeltsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.kindleapp.app.modules.allkindleminipotscentedsoycandles.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityAllKindleMiniPotScentedSoyCandlesBinding
import com.kindleapp.app.modules.allkindleminipotscentedsoycandles.`data`.viewmodel.AllKindleMiniPotScentedSoyCandlesVM
import kotlin.String
import kotlin.Unit

class AllKindleMiniPotScentedSoyCandlesActivity :
    BaseActivity<ActivityAllKindleMiniPotScentedSoyCandlesBinding>(R.layout.activity_all_kindle_mini_pot_scented_soy_candles)
    {
  private val viewModel: AllKindleMiniPotScentedSoyCandlesVM by
      viewModels<AllKindleMiniPotScentedSoyCandlesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.allKindleMiniPotScentedSoyCandlesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ALL_KINDLE_MINI_POT_SCENTED_SOY_CANDLES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AllKindleMiniPotScentedSoyCandlesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

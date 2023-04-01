package com.kindleapp.app.modules.paykindleminipotscentedsoycandles.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityPayKindleMiniPotScentedSoyCandlesBinding
import com.kindleapp.app.modules.paykindleminipotscentedsoycandles.`data`.viewmodel.PayKindleMiniPotScentedSoyCandlesVM
import kotlin.String
import kotlin.Unit

class PayKindleMiniPotScentedSoyCandlesActivity :
    BaseActivity<ActivityPayKindleMiniPotScentedSoyCandlesBinding>(R.layout.activity_pay_kindle_mini_pot_scented_soy_candles)
    {
  private val viewModel: PayKindleMiniPotScentedSoyCandlesVM by
      viewModels<PayKindleMiniPotScentedSoyCandlesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.payKindleMiniPotScentedSoyCandlesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PAY_KINDLE_MINI_POT_SCENTED_SOY_CANDLES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PayKindleMiniPotScentedSoyCandlesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

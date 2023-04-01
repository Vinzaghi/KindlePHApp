package com.kindleapp.app.modules.shipkindlescentedsoywaxmelts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityShipKindleScentedSoyWaxMeltsBinding
import com.kindleapp.app.modules.shipkindlescentedsoywaxmelts.`data`.viewmodel.ShipKindleScentedSoyWaxMeltsVM
import kotlin.String
import kotlin.Unit

class ShipKindleScentedSoyWaxMeltsActivity :
    BaseActivity<ActivityShipKindleScentedSoyWaxMeltsBinding>(R.layout.activity_ship_kindle_scented_soy_wax_melts)
    {
  private val viewModel: ShipKindleScentedSoyWaxMeltsVM by
      viewModels<ShipKindleScentedSoyWaxMeltsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.shipKindleScentedSoyWaxMeltsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SHIP_KINDLE_SCENTED_SOY_WAX_MELTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShipKindleScentedSoyWaxMeltsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.kindleapp.app.modules.shipkindlescentedsoywaxmelts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.shipkindlescentedsoywaxmelts.`data`.model.ShipKindleScentedSoyWaxMeltsModel
import org.koin.core.KoinComponent

class ShipKindleScentedSoyWaxMeltsVM : ViewModel(), KoinComponent {
  val shipKindleScentedSoyWaxMeltsModel: MutableLiveData<ShipKindleScentedSoyWaxMeltsModel> =
      MutableLiveData(ShipKindleScentedSoyWaxMeltsModel())

  var navArguments: Bundle? = null
}

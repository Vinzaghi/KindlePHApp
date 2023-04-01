package com.kindleapp.app.modules.paykindleminipotscentedsoycandles.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.paykindleminipotscentedsoycandles.`data`.model.PayKindleMiniPotScentedSoyCandlesModel
import org.koin.core.KoinComponent

class PayKindleMiniPotScentedSoyCandlesVM : ViewModel(), KoinComponent {
  val payKindleMiniPotScentedSoyCandlesModel:
      MutableLiveData<PayKindleMiniPotScentedSoyCandlesModel> =
      MutableLiveData(PayKindleMiniPotScentedSoyCandlesModel())

  var navArguments: Bundle? = null
}

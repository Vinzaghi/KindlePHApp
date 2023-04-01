package com.kindleapp.app.modules.allkindleminipotscentedsoycandles.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.allkindleminipotscentedsoycandles.`data`.model.AllKindleMiniPotScentedSoyCandlesModel
import org.koin.core.KoinComponent

class AllKindleMiniPotScentedSoyCandlesVM : ViewModel(), KoinComponent {
  val allKindleMiniPotScentedSoyCandlesModel:
      MutableLiveData<AllKindleMiniPotScentedSoyCandlesModel> =
      MutableLiveData(AllKindleMiniPotScentedSoyCandlesModel())

  var navArguments: Bundle? = null
}

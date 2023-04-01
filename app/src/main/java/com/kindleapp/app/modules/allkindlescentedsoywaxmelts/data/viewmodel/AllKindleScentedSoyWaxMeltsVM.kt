package com.kindleapp.app.modules.allkindlescentedsoywaxmelts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.allkindlescentedsoywaxmelts.`data`.model.AllKindleScentedSoyWaxMeltsModel
import org.koin.core.KoinComponent

class AllKindleScentedSoyWaxMeltsVM : ViewModel(), KoinComponent {
  val allKindleScentedSoyWaxMeltsModel: MutableLiveData<AllKindleScentedSoyWaxMeltsModel> =
      MutableLiveData(AllKindleScentedSoyWaxMeltsModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.allkindlescentedsoywaxmeltscancelled.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.allkindlescentedsoywaxmeltscancelled.`data`.model.AllKindleScentedSoyWaxMeltsCancelledModel
import org.koin.core.KoinComponent

class AllKindleScentedSoyWaxMeltsCancelledVM : ViewModel(), KoinComponent {
  val allKindleScentedSoyWaxMeltsCancelledModel:
      MutableLiveData<AllKindleScentedSoyWaxMeltsCancelledModel> =
      MutableLiveData(AllKindleScentedSoyWaxMeltsCancelledModel())

  var navArguments: Bundle? = null
}

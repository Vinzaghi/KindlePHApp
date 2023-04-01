package com.kindleapp.app.modules.cankindlescentedsoywaxmeltscancelled.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.cankindlescentedsoywaxmeltscancelled.`data`.model.CanKindleScentedSoyWaxMeltsCancelledModel
import org.koin.core.KoinComponent

class CanKindleScentedSoyWaxMeltsCancelledVM : ViewModel(), KoinComponent {
  val canKindleScentedSoyWaxMeltsCancelledModel:
      MutableLiveData<CanKindleScentedSoyWaxMeltsCancelledModel> =
      MutableLiveData(CanKindleScentedSoyWaxMeltsCancelledModel())

  var navArguments: Bundle? = null
}

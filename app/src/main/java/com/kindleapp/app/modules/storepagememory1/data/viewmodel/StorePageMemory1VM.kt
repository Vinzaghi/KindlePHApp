package com.kindleapp.app.modules.storepagememory1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.storepagememory1.`data`.model.StorePageMemory1Model
import org.koin.core.KoinComponent

class StorePageMemory1VM : ViewModel(), KoinComponent {
  val storePageMemory1Model: MutableLiveData<StorePageMemory1Model> =
      MutableLiveData(StorePageMemory1Model())

  var navArguments: Bundle? = null
}

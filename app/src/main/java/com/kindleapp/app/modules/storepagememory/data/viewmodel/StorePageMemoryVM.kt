package com.kindleapp.app.modules.storepagememory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.storepagememory.`data`.model.StorePageMemoryModel
import org.koin.core.KoinComponent

class StorePageMemoryVM : ViewModel(), KoinComponent {
  val storePageMemoryModel: MutableLiveData<StorePageMemoryModel> =
      MutableLiveData(StorePageMemoryModel())

  var navArguments: Bundle? = null
}

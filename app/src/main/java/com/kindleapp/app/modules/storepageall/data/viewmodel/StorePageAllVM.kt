package com.kindleapp.app.modules.storepageall.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.storepageall.`data`.model.StorePageAllModel
import org.koin.core.KoinComponent

class StorePageAllVM : ViewModel(), KoinComponent {
  val storePageAllModel: MutableLiveData<StorePageAllModel> = MutableLiveData(StorePageAllModel())

  var navArguments: Bundle? = null
}

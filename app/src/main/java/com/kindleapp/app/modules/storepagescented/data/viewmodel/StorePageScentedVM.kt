package com.kindleapp.app.modules.storepagescented.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.storepagescented.`data`.model.StorePageScentedModel
import org.koin.core.KoinComponent

class StorePageScentedVM : ViewModel(), KoinComponent {
  val storePageScentedModel: MutableLiveData<StorePageScentedModel> =
      MutableLiveData(StorePageScentedModel())

  var navArguments: Bundle? = null
}

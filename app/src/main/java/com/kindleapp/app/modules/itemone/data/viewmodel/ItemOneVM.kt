package com.kindleapp.app.modules.itemone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.itemone.`data`.model.ItemOneModel
import org.koin.core.KoinComponent

class ItemOneVM : ViewModel(), KoinComponent {
  val itemOneModel: MutableLiveData<ItemOneModel> = MutableLiveData(ItemOneModel())

  var navArguments: Bundle? = null
}

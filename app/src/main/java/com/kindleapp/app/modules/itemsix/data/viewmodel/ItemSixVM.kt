package com.kindleapp.app.modules.itemsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.itemsix.`data`.model.ItemSixModel
import org.koin.core.KoinComponent

class ItemSixVM : ViewModel(), KoinComponent {
  val itemSixModel: MutableLiveData<ItemSixModel> = MutableLiveData(ItemSixModel())

  var navArguments: Bundle? = null
}

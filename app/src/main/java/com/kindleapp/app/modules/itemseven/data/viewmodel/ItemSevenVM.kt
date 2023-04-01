package com.kindleapp.app.modules.itemseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.itemseven.`data`.model.ItemSevenModel
import org.koin.core.KoinComponent

class ItemSevenVM : ViewModel(), KoinComponent {
  val itemSevenModel: MutableLiveData<ItemSevenModel> = MutableLiveData(ItemSevenModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.itemfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.itemfour.`data`.model.ItemFourModel
import org.koin.core.KoinComponent

class ItemFourVM : ViewModel(), KoinComponent {
  val itemFourModel: MutableLiveData<ItemFourModel> = MutableLiveData(ItemFourModel())

  var navArguments: Bundle? = null
}

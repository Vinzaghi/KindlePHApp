package com.kindleapp.app.modules.itemtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.itemtwo.`data`.model.ItemTwoModel
import org.koin.core.KoinComponent

class ItemTwoVM : ViewModel(), KoinComponent {
  val itemTwoModel: MutableLiveData<ItemTwoModel> = MutableLiveData(ItemTwoModel())

  var navArguments: Bundle? = null
}

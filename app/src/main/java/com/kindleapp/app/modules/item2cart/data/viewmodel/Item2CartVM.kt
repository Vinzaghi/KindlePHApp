package com.kindleapp.app.modules.item2cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.item2cart.`data`.model.Item2CartModel
import org.koin.core.KoinComponent

class Item2CartVM : ViewModel(), KoinComponent {
  val item2CartModel: MutableLiveData<Item2CartModel> = MutableLiveData(Item2CartModel())

  var navArguments: Bundle? = null
}

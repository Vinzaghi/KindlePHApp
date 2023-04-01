package com.kindleapp.app.modules.item3cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.item3cart.`data`.model.Item3CartModel
import org.koin.core.KoinComponent

class Item3CartVM : ViewModel(), KoinComponent {
  val item3CartModel: MutableLiveData<Item3CartModel> = MutableLiveData(Item3CartModel())

  var navArguments: Bundle? = null
}

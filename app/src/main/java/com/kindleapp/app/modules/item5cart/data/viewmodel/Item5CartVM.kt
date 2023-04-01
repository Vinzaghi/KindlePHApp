package com.kindleapp.app.modules.item5cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.item5cart.`data`.model.Item5CartModel
import org.koin.core.KoinComponent

class Item5CartVM : ViewModel(), KoinComponent {
  val item5CartModel: MutableLiveData<Item5CartModel> = MutableLiveData(Item5CartModel())

  var navArguments: Bundle? = null
}

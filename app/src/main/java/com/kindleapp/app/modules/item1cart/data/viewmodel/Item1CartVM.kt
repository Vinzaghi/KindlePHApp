package com.kindleapp.app.modules.item1cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.item1cart.`data`.model.Item1CartModel
import org.koin.core.KoinComponent

class Item1CartVM : ViewModel(), KoinComponent {
  val item1CartModel: MutableLiveData<Item1CartModel> = MutableLiveData(Item1CartModel())

  var navArguments: Bundle? = null
}

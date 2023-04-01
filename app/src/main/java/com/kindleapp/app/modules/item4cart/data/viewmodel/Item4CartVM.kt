package com.kindleapp.app.modules.item4cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.item4cart.`data`.model.Item4CartModel
import org.koin.core.KoinComponent

class Item4CartVM : ViewModel(), KoinComponent {
  val item4CartModel: MutableLiveData<Item4CartModel> = MutableLiveData(Item4CartModel())

  var navArguments: Bundle? = null
}

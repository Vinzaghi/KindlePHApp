package com.kindleapp.app.modules.itemfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.itemfive.`data`.model.ItemFiveModel
import org.koin.core.KoinComponent

class ItemFiveVM : ViewModel(), KoinComponent {
  val itemFiveModel: MutableLiveData<ItemFiveModel> = MutableLiveData(ItemFiveModel())

  var navArguments: Bundle? = null
}

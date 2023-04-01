package com.kindleapp.app.modules.itemthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.itemthree.`data`.model.ItemThreeModel
import org.koin.core.KoinComponent

class ItemThreeVM : ViewModel(), KoinComponent {
  val itemThreeModel: MutableLiveData<ItemThreeModel> = MutableLiveData(ItemThreeModel())

  var navArguments: Bundle? = null
}

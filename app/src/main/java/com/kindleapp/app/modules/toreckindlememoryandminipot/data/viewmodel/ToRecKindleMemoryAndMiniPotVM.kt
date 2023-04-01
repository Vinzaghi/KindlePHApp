package com.kindleapp.app.modules.toreckindlememoryandminipot.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.toreckindlememoryandminipot.`data`.model.ToRecKindleMemoryAndMiniPotModel
import com.kindleapp.app.modules.toreckindlememoryandminipot.`data`.model.ToreceiveRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ToRecKindleMemoryAndMiniPotVM : ViewModel(), KoinComponent {
  val toRecKindleMemoryAndMiniPotModel: MutableLiveData<ToRecKindleMemoryAndMiniPotModel> =
      MutableLiveData(ToRecKindleMemoryAndMiniPotModel())

  var navArguments: Bundle? = null

  val toReceiveList: MutableLiveData<MutableList<ToreceiveRowModel>> =
      MutableLiveData(mutableListOf())
}

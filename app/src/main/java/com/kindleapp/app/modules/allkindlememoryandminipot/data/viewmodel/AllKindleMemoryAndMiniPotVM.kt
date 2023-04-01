package com.kindleapp.app.modules.allkindlememoryandminipot.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.allkindlememoryandminipot.`data`.model.AllKindleMemoryAndMiniPotModel
import com.kindleapp.app.modules.allkindlememoryandminipot.`data`.model.Toreceive2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AllKindleMemoryAndMiniPotVM : ViewModel(), KoinComponent {
  val allKindleMemoryAndMiniPotModel: MutableLiveData<AllKindleMemoryAndMiniPotModel> =
      MutableLiveData(AllKindleMemoryAndMiniPotModel())

  var navArguments: Bundle? = null

  val toReceiveList: MutableLiveData<MutableList<Toreceive2RowModel>> =
      MutableLiveData(mutableListOf())
}

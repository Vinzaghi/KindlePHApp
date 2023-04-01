package com.kindleapp.app.modules.reckindleminipotandscented.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.reckindleminipotandscented.`data`.model.RecKindleMiniPotAndScentedModel
import com.kindleapp.app.modules.reckindleminipotandscented.`data`.model.Toreceive1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecKindleMiniPotAndScentedVM : ViewModel(), KoinComponent {
  val recKindleMiniPotAndScentedModel: MutableLiveData<RecKindleMiniPotAndScentedModel> =
      MutableLiveData(RecKindleMiniPotAndScentedModel())

  var navArguments: Bundle? = null

  val toReceiveList: MutableLiveData<MutableList<Toreceive1RowModel>> =
      MutableLiveData(mutableListOf())
}

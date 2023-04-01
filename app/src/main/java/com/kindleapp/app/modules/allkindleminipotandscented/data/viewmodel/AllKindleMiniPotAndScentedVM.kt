package com.kindleapp.app.modules.allkindleminipotandscented.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.allkindleminipotandscented.`data`.model.AllKindleMiniPotAndScentedModel
import com.kindleapp.app.modules.allkindleminipotandscented.`data`.model.Toreceive3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AllKindleMiniPotAndScentedVM : ViewModel(), KoinComponent {
  val allKindleMiniPotAndScentedModel: MutableLiveData<AllKindleMiniPotAndScentedModel> =
      MutableLiveData(AllKindleMiniPotAndScentedModel())

  var navArguments: Bundle? = null

  val toReceiveList: MutableLiveData<MutableList<Toreceive3RowModel>> =
      MutableLiveData(mutableListOf())
}

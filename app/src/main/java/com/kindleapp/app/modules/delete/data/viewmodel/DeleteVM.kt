package com.kindleapp.app.modules.delete.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.delete.`data`.model.DeleteModel
import com.kindleapp.app.modules.delete.`data`.model.Listkindlesoywax1RowModel
import com.kindleapp.app.modules.delete.`data`.model.ListkindlesoywaxOneRowModel
import com.kindleapp.app.modules.delete.`data`.model.ListkindlesoywaxThree1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DeleteVM : ViewModel(), KoinComponent {
  val deleteModel: MutableLiveData<DeleteModel> = MutableLiveData(DeleteModel())

  var navArguments: Bundle? = null

  val listkindlesoywaxList: MutableLiveData<MutableList<Listkindlesoywax1RowModel>> =
      MutableLiveData(mutableListOf())

  val listkindlesoywaxOneList: MutableLiveData<MutableList<ListkindlesoywaxOneRowModel>> =
      MutableLiveData(mutableListOf())

  val listkindlesoywaxThreeList: MutableLiveData<MutableList<ListkindlesoywaxThree1RowModel>> =
      MutableLiveData(mutableListOf())
}

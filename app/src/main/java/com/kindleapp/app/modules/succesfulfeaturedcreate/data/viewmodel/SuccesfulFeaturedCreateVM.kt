package com.kindleapp.app.modules.succesfulfeaturedcreate.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.succesfulfeaturedcreate.`data`.model.Gridplus1RowModel
import com.kindleapp.app.modules.succesfulfeaturedcreate.`data`.model.SuccesfulFeaturedCreateModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SuccesfulFeaturedCreateVM : ViewModel(), KoinComponent {
  val succesfulFeaturedCreateModel: MutableLiveData<SuccesfulFeaturedCreateModel> =
      MutableLiveData(SuccesfulFeaturedCreateModel())

  var navArguments: Bundle? = null

  val gridplusList: MutableLiveData<MutableList<Gridplus1RowModel>> =
      MutableLiveData(mutableListOf())
}

package com.kindleapp.app.modules.createnewfeaturedproduct.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.createnewfeaturedproduct.`data`.model.CreateNewFeaturedProductModel
import com.kindleapp.app.modules.createnewfeaturedproduct.`data`.model.GridplusRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CreateNewFeaturedProductVM : ViewModel(), KoinComponent {
  val createNewFeaturedProductModel: MutableLiveData<CreateNewFeaturedProductModel> =
      MutableLiveData(CreateNewFeaturedProductModel())

  var navArguments: Bundle? = null

  val gridplusList: MutableLiveData<MutableList<GridplusRowModel>> =
      MutableLiveData(mutableListOf())
}

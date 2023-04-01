package com.kindleapp.app.modules.myproducts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.myproducts.`data`.model.ListkindlesoywaxRowModel
import com.kindleapp.app.modules.myproducts.`data`.model.ListkindlesoywaxThreeRowModel
import com.kindleapp.app.modules.myproducts.`data`.model.MyProductsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyProductsVM : ViewModel(), KoinComponent {
  val myProductsModel: MutableLiveData<MyProductsModel> = MutableLiveData(MyProductsModel())

  var navArguments: Bundle? = null

  val listkindlesoywaxList: MutableLiveData<MutableList<ListkindlesoywaxRowModel>> =
      MutableLiveData(mutableListOf())

  val listkindlesoywaxThreeList: MutableLiveData<MutableList<ListkindlesoywaxThreeRowModel>> =
      MutableLiveData(mutableListOf())
}

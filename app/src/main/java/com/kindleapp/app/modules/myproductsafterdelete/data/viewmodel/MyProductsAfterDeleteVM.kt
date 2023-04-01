package com.kindleapp.app.modules.myproductsafterdelete.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.myproductsafterdelete.`data`.model.ListkindlecandlebRowModel
import com.kindleapp.app.modules.myproductsafterdelete.`data`.model.MyProductsAfterDeleteModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyProductsAfterDeleteVM : ViewModel(), KoinComponent {
  val myProductsAfterDeleteModel: MutableLiveData<MyProductsAfterDeleteModel> =
      MutableLiveData(MyProductsAfterDeleteModel())

  var navArguments: Bundle? = null

  val listkindlecandlebList: MutableLiveData<MutableList<ListkindlecandlebRowModel>> =
      MutableLiveData(mutableListOf())
}

package com.kindleapp.app.modules.editproducts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.editproducts.`data`.model.EditProductsModel
import org.koin.core.KoinComponent

class EditProductsVM : ViewModel(), KoinComponent {
  val editProductsModel: MutableLiveData<EditProductsModel> = MutableLiveData(EditProductsModel())

  var navArguments: Bundle? = null
}

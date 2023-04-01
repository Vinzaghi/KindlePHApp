package com.kindleapp.app.modules.editproductssuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.editproductssuccessful.`data`.model.EditProductsSuccessfulModel
import org.koin.core.KoinComponent

class EditProductsSuccessfulVM : ViewModel(), KoinComponent {
  val editProductsSuccessfulModel: MutableLiveData<EditProductsSuccessfulModel> =
      MutableLiveData(EditProductsSuccessfulModel())

  var navArguments: Bundle? = null
}

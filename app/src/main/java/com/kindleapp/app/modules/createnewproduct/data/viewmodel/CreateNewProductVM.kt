package com.kindleapp.app.modules.createnewproduct.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.createnewproduct.`data`.model.CreateNewProductModel
import org.koin.core.KoinComponent

class CreateNewProductVM : ViewModel(), KoinComponent {
  val createNewProductModel: MutableLiveData<CreateNewProductModel> =
      MutableLiveData(CreateNewProductModel())

  var navArguments: Bundle? = null
}

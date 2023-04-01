package com.kindleapp.app.modules.createproductsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.createproductsuccessful.`data`.model.CreateProductSuccessfulModel
import org.koin.core.KoinComponent

class CreateProductSuccessfulVM : ViewModel(), KoinComponent {
  val createProductSuccessfulModel: MutableLiveData<CreateProductSuccessfulModel> =
      MutableLiveData(CreateProductSuccessfulModel())

  var navArguments: Bundle? = null
}

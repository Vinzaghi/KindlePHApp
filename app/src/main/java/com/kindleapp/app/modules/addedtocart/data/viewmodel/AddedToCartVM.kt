package com.kindleapp.app.modules.addedtocart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.addedtocart.`data`.model.AddedToCartModel
import org.koin.core.KoinComponent

class AddedToCartVM : ViewModel(), KoinComponent {
  val addedToCartModel: MutableLiveData<AddedToCartModel> = MutableLiveData(AddedToCartModel())

  var navArguments: Bundle? = null
}

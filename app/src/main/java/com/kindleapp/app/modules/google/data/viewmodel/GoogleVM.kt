package com.kindleapp.app.modules.google.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.google.`data`.model.GoogleModel
import org.koin.core.KoinComponent

class GoogleVM : ViewModel(), KoinComponent {
  val googleModel: MutableLiveData<GoogleModel> = MutableLiveData(GoogleModel())

  var navArguments: Bundle? = null
}

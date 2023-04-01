package com.kindleapp.app.modules.loadingscreenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.loadingscreenone.`data`.model.LoadingScreenOneModel
import org.koin.core.KoinComponent

class LoadingScreenOneVM : ViewModel(), KoinComponent {
  val loadingScreenOneModel: MutableLiveData<LoadingScreenOneModel> =
      MutableLiveData(LoadingScreenOneModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.loadingscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.loadingscreen.`data`.model.LoadingScreenModel
import org.koin.core.KoinComponent

class LoadingScreenVM : ViewModel(), KoinComponent {
  val loadingScreenModel: MutableLiveData<LoadingScreenModel> =
      MutableLiveData(LoadingScreenModel())

  var navArguments: Bundle? = null
}

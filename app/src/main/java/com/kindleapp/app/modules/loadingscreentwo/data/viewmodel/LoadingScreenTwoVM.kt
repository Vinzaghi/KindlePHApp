package com.kindleapp.app.modules.loadingscreentwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.loadingscreentwo.`data`.model.LoadingScreenTwoModel
import org.koin.core.KoinComponent

class LoadingScreenTwoVM : ViewModel(), KoinComponent {
  val loadingScreenTwoModel: MutableLiveData<LoadingScreenTwoModel> =
      MutableLiveData(LoadingScreenTwoModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.forgetpasssuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.forgetpasssuccessful.`data`.model.ForgetPassSuccessfulModel
import org.koin.core.KoinComponent

class ForgetPassSuccessfulVM : ViewModel(), KoinComponent {
  val forgetPassSuccessfulModel: MutableLiveData<ForgetPassSuccessfulModel> =
      MutableLiveData(ForgetPassSuccessfulModel())

  var navArguments: Bundle? = null
}

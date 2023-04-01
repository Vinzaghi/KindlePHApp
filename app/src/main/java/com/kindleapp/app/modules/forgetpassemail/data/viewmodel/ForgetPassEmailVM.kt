package com.kindleapp.app.modules.forgetpassemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.forgetpassemail.`data`.model.ForgetPassEmailModel
import org.koin.core.KoinComponent

class ForgetPassEmailVM : ViewModel(), KoinComponent {
  val forgetPassEmailModel: MutableLiveData<ForgetPassEmailModel> =
      MutableLiveData(ForgetPassEmailModel())

  var navArguments: Bundle? = null
}

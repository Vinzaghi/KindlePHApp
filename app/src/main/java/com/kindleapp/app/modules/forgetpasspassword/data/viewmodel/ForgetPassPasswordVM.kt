package com.kindleapp.app.modules.forgetpasspassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.forgetpasspassword.`data`.model.ForgetPassPasswordModel
import org.koin.core.KoinComponent

class ForgetPassPasswordVM : ViewModel(), KoinComponent {
  val forgetPassPasswordModel: MutableLiveData<ForgetPassPasswordModel> =
      MutableLiveData(ForgetPassPasswordModel())

  var navArguments: Bundle? = null
}

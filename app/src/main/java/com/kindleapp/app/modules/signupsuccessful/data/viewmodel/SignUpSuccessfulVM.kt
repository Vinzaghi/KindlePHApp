package com.kindleapp.app.modules.signupsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.signupsuccessful.`data`.model.SignUpSuccessfulModel
import org.koin.core.KoinComponent

class SignUpSuccessfulVM : ViewModel(), KoinComponent {
  val signUpSuccessfulModel: MutableLiveData<SignUpSuccessfulModel> =
      MutableLiveData(SignUpSuccessfulModel())

  var navArguments: Bundle? = null
}

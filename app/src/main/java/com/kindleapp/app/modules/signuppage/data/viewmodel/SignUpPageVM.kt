package com.kindleapp.app.modules.signuppage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.signuppage.`data`.model.SignUpPageModel
import org.koin.core.KoinComponent

class SignUpPageVM : ViewModel(), KoinComponent {
  val signUpPageModel: MutableLiveData<SignUpPageModel> = MutableLiveData(SignUpPageModel())

  var navArguments: Bundle? = null
}

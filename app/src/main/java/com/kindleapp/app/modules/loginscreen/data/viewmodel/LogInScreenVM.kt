package com.kindleapp.app.modules.loginscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.loginscreen.`data`.model.LogInScreenModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class LogInScreenVM : ViewModel(), KoinComponent {
  val logInScreenModel: MutableLiveData<LogInScreenModel> = MutableLiveData(LogInScreenModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()
}

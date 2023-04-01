package com.kindleapp.app.modules.loginerrorscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.loginerrorscreen.`data`.model.LogInErrorScreenModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class LogInErrorScreenVM : ViewModel(), KoinComponent {
  val logInErrorScreenModel: MutableLiveData<LogInErrorScreenModel> =
      MutableLiveData(LogInErrorScreenModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()
}

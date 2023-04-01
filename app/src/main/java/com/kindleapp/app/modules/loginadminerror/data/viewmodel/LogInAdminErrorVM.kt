package com.kindleapp.app.modules.loginadminerror.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.loginadminerror.`data`.model.LogInAdminErrorModel
import org.koin.core.KoinComponent

class LogInAdminErrorVM : ViewModel(), KoinComponent {
  val logInAdminErrorModel: MutableLiveData<LogInAdminErrorModel> =
      MutableLiveData(LogInAdminErrorModel())

  var navArguments: Bundle? = null
}

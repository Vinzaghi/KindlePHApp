package com.kindleapp.app.modules.loginadmin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.loginadmin.`data`.model.LogInAdminModel
import org.koin.core.KoinComponent

class LogInAdminVM : ViewModel(), KoinComponent {
  val logInAdminModel: MutableLiveData<LogInAdminModel> = MutableLiveData(LogInAdminModel())

  var navArguments: Bundle? = null
}

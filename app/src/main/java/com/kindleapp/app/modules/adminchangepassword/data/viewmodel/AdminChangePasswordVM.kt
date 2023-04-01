package com.kindleapp.app.modules.adminchangepassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.adminchangepassword.`data`.model.AdminChangePasswordModel
import org.koin.core.KoinComponent

class AdminChangePasswordVM : ViewModel(), KoinComponent {
  val adminChangePasswordModel: MutableLiveData<AdminChangePasswordModel> =
      MutableLiveData(AdminChangePasswordModel())

  var navArguments: Bundle? = null
}

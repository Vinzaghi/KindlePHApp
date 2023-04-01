package com.kindleapp.app.modules.adminsuccessfullychangepassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.adminsuccessfullychangepassword.`data`.model.AdminSuccessfullyChangePasswordModel
import org.koin.core.KoinComponent

class AdminSuccessfullyChangePasswordVM : ViewModel(), KoinComponent {
  val adminSuccessfullyChangePasswordModel: MutableLiveData<AdminSuccessfullyChangePasswordModel> =
      MutableLiveData(AdminSuccessfullyChangePasswordModel())

  var navArguments: Bundle? = null
}

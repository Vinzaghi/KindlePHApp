package com.kindleapp.app.modules.admineditpersonalinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.admineditpersonalinformation.`data`.model.AdminEditPersonalInformationModel
import org.koin.core.KoinComponent

class AdminEditPersonalInformationVM : ViewModel(), KoinComponent {
  val adminEditPersonalInformationModel: MutableLiveData<AdminEditPersonalInformationModel> =
      MutableLiveData(AdminEditPersonalInformationModel())

  var navArguments: Bundle? = null
}

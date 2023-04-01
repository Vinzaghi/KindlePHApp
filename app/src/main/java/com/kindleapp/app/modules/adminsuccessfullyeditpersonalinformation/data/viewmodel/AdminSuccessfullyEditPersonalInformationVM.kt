package com.kindleapp.app.modules.adminsuccessfullyeditpersonalinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.adminsuccessfullyeditpersonalinformation.`data`.model.AdminSuccessfullyEditPersonalInformationModel
import org.koin.core.KoinComponent

class AdminSuccessfullyEditPersonalInformationVM : ViewModel(), KoinComponent {
  val adminSuccessfullyEditPersonalInformationModel:
      MutableLiveData<AdminSuccessfullyEditPersonalInformationModel> =
      MutableLiveData(AdminSuccessfullyEditPersonalInformationModel())

  var navArguments: Bundle? = null
}

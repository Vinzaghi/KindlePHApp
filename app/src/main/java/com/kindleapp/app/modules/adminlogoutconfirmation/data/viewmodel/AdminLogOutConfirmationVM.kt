package com.kindleapp.app.modules.adminlogoutconfirmation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.adminlogoutconfirmation.`data`.model.AdminLogOutConfirmationModel
import org.koin.core.KoinComponent

class AdminLogOutConfirmationVM : ViewModel(), KoinComponent {
  val adminLogOutConfirmationModel: MutableLiveData<AdminLogOutConfirmationModel> =
      MutableLiveData(AdminLogOutConfirmationModel())

  var navArguments: Bundle? = null
}

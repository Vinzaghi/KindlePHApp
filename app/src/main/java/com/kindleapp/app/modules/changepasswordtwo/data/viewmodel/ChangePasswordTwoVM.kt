package com.kindleapp.app.modules.changepasswordtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.changepasswordtwo.`data`.model.ChangePasswordTwoModel
import org.koin.core.KoinComponent

class ChangePasswordTwoVM : ViewModel(), KoinComponent {
  val changePasswordTwoModel: MutableLiveData<ChangePasswordTwoModel> =
      MutableLiveData(ChangePasswordTwoModel())

  var navArguments: Bundle? = null
}

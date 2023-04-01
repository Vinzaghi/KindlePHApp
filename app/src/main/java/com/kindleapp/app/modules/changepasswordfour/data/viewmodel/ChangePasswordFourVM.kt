package com.kindleapp.app.modules.changepasswordfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.changepasswordfour.`data`.model.ChangePasswordFourModel
import org.koin.core.KoinComponent

class ChangePasswordFourVM : ViewModel(), KoinComponent {
  val changePasswordFourModel: MutableLiveData<ChangePasswordFourModel> =
      MutableLiveData(ChangePasswordFourModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.changepasswordfour1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.changepasswordfour1.`data`.model.ChangePasswordFour1Model
import org.koin.core.KoinComponent

class ChangePasswordFour1VM : ViewModel(), KoinComponent {
  val changePasswordFour1Model: MutableLiveData<ChangePasswordFour1Model> =
      MutableLiveData(ChangePasswordFour1Model())

  var navArguments: Bundle? = null
}

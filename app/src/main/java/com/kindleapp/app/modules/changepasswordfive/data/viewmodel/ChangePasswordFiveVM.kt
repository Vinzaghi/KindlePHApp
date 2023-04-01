package com.kindleapp.app.modules.changepasswordfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.changepasswordfive.`data`.model.ChangePasswordFiveModel
import org.koin.core.KoinComponent

class ChangePasswordFiveVM : ViewModel(), KoinComponent {
  val changePasswordFiveModel: MutableLiveData<ChangePasswordFiveModel> =
      MutableLiveData(ChangePasswordFiveModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.changepasswordthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.changepasswordthree.`data`.model.ChangePasswordThreeModel
import org.koin.core.KoinComponent

class ChangePasswordThreeVM : ViewModel(), KoinComponent {
  val changePasswordThreeModel: MutableLiveData<ChangePasswordThreeModel> =
      MutableLiveData(ChangePasswordThreeModel())

  var navArguments: Bundle? = null
}

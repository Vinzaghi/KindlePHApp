package com.kindleapp.app.modules.usermyorderscancelledtab.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usermyorderscancelledtab.`data`.model.UserMyOrdersCancelledTabModel
import org.koin.core.KoinComponent

class UserMyOrdersCancelledTabVM : ViewModel(), KoinComponent {
  val userMyOrdersCancelledTabModel: MutableLiveData<UserMyOrdersCancelledTabModel> =
      MutableLiveData(UserMyOrdersCancelledTabModel())

  var navArguments: Bundle? = null
}

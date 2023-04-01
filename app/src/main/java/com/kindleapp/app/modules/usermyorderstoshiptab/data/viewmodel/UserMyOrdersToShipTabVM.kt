package com.kindleapp.app.modules.usermyorderstoshiptab.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usermyorderstoshiptab.`data`.model.UserMyOrdersToShipTabModel
import org.koin.core.KoinComponent

class UserMyOrdersToShipTabVM : ViewModel(), KoinComponent {
  val userMyOrdersToShipTabModel: MutableLiveData<UserMyOrdersToShipTabModel> =
      MutableLiveData(UserMyOrdersToShipTabModel())

  var navArguments: Bundle? = null
}

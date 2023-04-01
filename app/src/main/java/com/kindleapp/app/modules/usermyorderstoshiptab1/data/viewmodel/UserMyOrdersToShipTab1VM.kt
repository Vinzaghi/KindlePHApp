package com.kindleapp.app.modules.usermyorderstoshiptab1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usermyorderstoshiptab1.`data`.model.UserMyOrdersToShipTab1Model
import org.koin.core.KoinComponent

class UserMyOrdersToShipTab1VM : ViewModel(), KoinComponent {
  val userMyOrdersToShipTab1Model: MutableLiveData<UserMyOrdersToShipTab1Model> =
      MutableLiveData(UserMyOrdersToShipTab1Model())

  var navArguments: Bundle? = null
}

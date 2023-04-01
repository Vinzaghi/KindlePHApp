package com.kindleapp.app.modules.usermyordersreceivedtab.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usermyordersreceivedtab.`data`.model.UserMyOrdersReceivedTabModel
import org.koin.core.KoinComponent

class UserMyOrdersReceivedTabVM : ViewModel(), KoinComponent {
  val userMyOrdersReceivedTabModel: MutableLiveData<UserMyOrdersReceivedTabModel> =
      MutableLiveData(UserMyOrdersReceivedTabModel())

  var navArguments: Bundle? = null
}

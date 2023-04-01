package com.kindleapp.app.modules.usermyorderstopaytab.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usermyorderstopaytab.`data`.model.UserMyOrdersToPayTabModel
import org.koin.core.KoinComponent

class UserMyOrdersToPayTabVM : ViewModel(), KoinComponent {
  val userMyOrdersToPayTabModel: MutableLiveData<UserMyOrdersToPayTabModel> =
      MutableLiveData(UserMyOrdersToPayTabModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.usercheckoutconfirmed.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usercheckoutconfirmed.`data`.model.UserCheckoutConfirmedModel
import org.koin.core.KoinComponent

class UserCheckoutConfirmedVM : ViewModel(), KoinComponent {
  val userCheckoutConfirmedModel: MutableLiveData<UserCheckoutConfirmedModel> =
      MutableLiveData(UserCheckoutConfirmedModel())

  var navArguments: Bundle? = null
}

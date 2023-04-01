package com.kindleapp.app.modules.usercheckoutconfirmationptwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usercheckoutconfirmationptwo.`data`.model.UserCheckoutConfirmationPtwoModel
import org.koin.core.KoinComponent

class UserCheckoutConfirmationPtwoVM : ViewModel(), KoinComponent {
  val userCheckoutConfirmationPtwoModel: MutableLiveData<UserCheckoutConfirmationPtwoModel> =
      MutableLiveData(UserCheckoutConfirmationPtwoModel())

  var navArguments: Bundle? = null
}

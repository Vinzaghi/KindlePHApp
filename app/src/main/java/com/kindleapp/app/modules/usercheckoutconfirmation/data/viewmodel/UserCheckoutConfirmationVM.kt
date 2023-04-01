package com.kindleapp.app.modules.usercheckoutconfirmation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usercheckoutconfirmation.`data`.model.UserCheckoutConfirmationModel
import org.koin.core.KoinComponent

class UserCheckoutConfirmationVM : ViewModel(), KoinComponent {
  val userCheckoutConfirmationModel: MutableLiveData<UserCheckoutConfirmationModel> =
      MutableLiveData(UserCheckoutConfirmationModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.userpaymentmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.userpaymentmethod.`data`.model.UserPaymentMethodModel
import org.koin.core.KoinComponent

class UserPaymentMethodVM : ViewModel(), KoinComponent {
  val userPaymentMethodModel: MutableLiveData<UserPaymentMethodModel> =
      MutableLiveData(UserPaymentMethodModel())

  var navArguments: Bundle? = null
}

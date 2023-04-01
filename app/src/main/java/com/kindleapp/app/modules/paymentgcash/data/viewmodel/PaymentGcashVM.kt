package com.kindleapp.app.modules.paymentgcash.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.paymentgcash.`data`.model.PaymentGcashModel
import org.koin.core.KoinComponent

class PaymentGcashVM : ViewModel(), KoinComponent {
  val paymentGcashModel: MutableLiveData<PaymentGcashModel> = MutableLiveData(PaymentGcashModel())

  var navArguments: Bundle? = null
}

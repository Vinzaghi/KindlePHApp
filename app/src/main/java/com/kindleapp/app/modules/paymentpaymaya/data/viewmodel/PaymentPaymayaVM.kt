package com.kindleapp.app.modules.paymentpaymaya.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.paymentpaymaya.`data`.model.PaymentPaymayaModel
import org.koin.core.KoinComponent

class PaymentPaymayaVM : ViewModel(), KoinComponent {
  val paymentPaymayaModel: MutableLiveData<PaymentPaymayaModel> =
      MutableLiveData(PaymentPaymayaModel())

  var navArguments: Bundle? = null
}

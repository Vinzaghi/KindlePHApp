package com.kindleapp.app.modules.paymentdebitcredit.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.paymentdebitcredit.`data`.model.PaymentDebitCreditModel
import org.koin.core.KoinComponent

class PaymentDebitCreditVM : ViewModel(), KoinComponent {
  val paymentDebitCreditModel: MutableLiveData<PaymentDebitCreditModel> =
      MutableLiveData(PaymentDebitCreditModel())

  var navArguments: Bundle? = null
}

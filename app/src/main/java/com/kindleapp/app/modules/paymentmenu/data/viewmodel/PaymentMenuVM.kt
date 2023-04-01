package com.kindleapp.app.modules.paymentmenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.paymentmenu.`data`.model.PaymentMenuModel
import com.kindleapp.app.modules.paymentmenu.`data`.model.PaymentMenuRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaymentMenuVM : ViewModel(), KoinComponent {
  val paymentMenuModel: MutableLiveData<PaymentMenuModel> = MutableLiveData(PaymentMenuModel())

  var navArguments: Bundle? = null

  val paymentMenuList: MutableLiveData<MutableList<PaymentMenuRowModel>> =
      MutableLiveData(mutableListOf())
}

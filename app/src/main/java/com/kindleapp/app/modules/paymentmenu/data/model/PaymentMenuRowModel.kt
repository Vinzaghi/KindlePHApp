package com.kindleapp.app.modules.paymentmenu.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentMenuRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGCash: String? = MyApp.getInstance().resources.getString(R.string.lbl_gcash)

)

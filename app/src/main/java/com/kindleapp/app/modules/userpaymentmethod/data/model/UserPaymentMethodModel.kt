package com.kindleapp.app.modules.userpaymentmethod.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class UserPaymentMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourActivePay: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_active_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouCurrentlyH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_currently_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWantMorePayme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_want_more_payme)

)

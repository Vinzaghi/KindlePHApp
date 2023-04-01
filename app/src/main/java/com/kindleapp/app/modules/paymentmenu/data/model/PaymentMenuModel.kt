package com.kindleapp.app.modules.paymentmenu.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddingPayment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_adding_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseyourPay: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_your_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPreferredPayme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_preferred_payme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoneedtofret: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_need_to_fret)

)

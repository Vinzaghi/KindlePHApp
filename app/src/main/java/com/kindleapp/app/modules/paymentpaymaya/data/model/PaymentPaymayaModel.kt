package com.kindleapp.app.modules.paymentpaymaya.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentPaymayaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddingPayment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_adding_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountName: String? = MyApp.getInstance().resources.getString(R.string.lbl_account_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSampleNameHer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sample_name_her)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryour11d: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_11_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_paymaya_philipp)
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

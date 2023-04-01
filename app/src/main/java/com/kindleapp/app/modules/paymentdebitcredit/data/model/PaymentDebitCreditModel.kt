package com.kindleapp.app.modules.paymentdebitcredit.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentDebitCreditModel(
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
  var txtCardNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt000000000000: String? =
      MyApp.getInstance().resources.getString(R.string.msg_0000_0000_0000)
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
  var txtDebitCredit: String? = MyApp.getInstance().resources.getString(R.string.msg_debit_credit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpiration: String? = MyApp.getInstance().resources.getString(R.string.lbl_expiration)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMMYY: String? = MyApp.getInstance().resources.getString(R.string.lbl_mm_yy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCVV: String? = MyApp.getInstance().resources.getString(R.string.lbl_cvv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_123)
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

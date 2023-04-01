package com.kindleapp.app.modules.viewtransactions.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ViewTransactionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactions: String? = MyApp.getInstance().resources.getString(R.string.lbl_transactions2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTvsmixEighteenThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tvsmix18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomerNameThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_customer_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderNumberTwoThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_number_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress60PinThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_address_60_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleSoyWaxThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_soy_wax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreshBambooThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fresh_bamboo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVanillaThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_vanilla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX1Three: String? = MyApp.getInstance().resources.getString(R.string.lbl_x1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX2Three: String? = MyApp.getInstance().resources.getString(R.string.lbl_x2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingFeeThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shipping_fee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEightThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_48)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNinetySixThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_96)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_49)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_193)

)

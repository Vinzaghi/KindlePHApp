package com.kindleapp.app.modules.viewtransactions.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListlolRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTvsmixEighteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_tvsmix18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomerName: String? = MyApp.getInstance().resources.getString(R.string.msg_customer_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderNumberTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_number_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress60Pin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_address_60_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleSoyWax: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_soy_wax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreshBamboo: String? = MyApp.getInstance().resources.getString(R.string.lbl_fresh_bamboo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVanilla: String? = MyApp.getInstance().resources.getString(R.string.lbl_vanilla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX1: String? = MyApp.getInstance().resources.getString(R.string.lbl_x1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX2: String? = MyApp.getInstance().resources.getString(R.string.lbl_x2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingFee: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping_fee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_48)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNinetySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_96)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_49)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_193)

)

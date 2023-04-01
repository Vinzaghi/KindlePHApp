package com.kindleapp.app.modules.usermyordersreceivedtab.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class UserMyOrdersReceivedTabModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_received)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleMiniPot: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_mini_pot2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScentsLavende: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scents_lavende)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_50ml)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_58_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQtyCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleScented: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_scented)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScentsLavendeOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scents_lavende)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_30g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQtyCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_total_3_item)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyagainBtn: String? = MyApp.getInstance().resources.getString(R.string.lbl_buy_again)

)

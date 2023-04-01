package com.kindleapp.app.modules.usermyordersalltab.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListtopayRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToPay: String? = MyApp.getInstance().resources.getString(R.string.lbl_to_pay)
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
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_total_1_item)

)

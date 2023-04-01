package com.kindleapp.app.modules.usermyordersalltab.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListkindlememorycRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleMemoryC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_memory_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScentsUnscent: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scents_unscent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurementOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_color_and_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_300_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQtyCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty_2)

)

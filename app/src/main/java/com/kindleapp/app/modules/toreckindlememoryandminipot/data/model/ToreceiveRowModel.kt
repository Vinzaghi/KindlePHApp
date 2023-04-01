package com.kindleapp.app.modules.toreckindlememoryandminipot.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ToreceiveRowModel(
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
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.msg_color_and_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_300_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQtyCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty_2)

)

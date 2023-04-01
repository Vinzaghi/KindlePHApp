package com.kindleapp.app.modules.myproductsafterdelete.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListkindlecandlebRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleCandleB: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_candle_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStock15Left: String? = MyApp.getInstance().resources.getString(R.string.lbl_stock_15_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup144: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup141: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)

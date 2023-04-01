package com.kindleapp.app.modules.delete.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class Listkindlesoywax1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleSoyWax: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_soy_wax)
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
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelete: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)

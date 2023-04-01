package com.kindleapp.app.modules.delete.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListkindlesoywaxOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleSoyWaxOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_soy_wax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStock15LeftTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stock_15_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup305: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup302: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)

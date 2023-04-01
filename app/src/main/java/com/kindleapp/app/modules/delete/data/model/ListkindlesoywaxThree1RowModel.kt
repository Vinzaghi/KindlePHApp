package com.kindleapp.app.modules.delete.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListkindlesoywaxThree1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleSoyWaxThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_soy_wax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStock15LeftFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stock_15_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup307: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup304: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)

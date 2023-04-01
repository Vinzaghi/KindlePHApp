package com.kindleapp.app.modules.usercart.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class UserCartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_158_00)

)

package com.kindleapp.app.modules.item1cart.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class Item1CartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_3_000_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtITEMNAME: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScent: String? = MyApp.getInstance().resources.getString(R.string.lbl_scent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQuantity: String? = MyApp.getInstance().resources.getString(R.string.lbl_quantity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStocksleftTwentyThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stocks_left_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)

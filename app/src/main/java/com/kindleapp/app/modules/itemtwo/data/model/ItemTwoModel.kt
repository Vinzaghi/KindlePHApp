package com.kindleapp.app.modules.itemtwo.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ItemTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtITEMNAME: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStocksleftFifteen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stocks_left_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_3_000_00_2_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDimensions: String? = MyApp.getInstance().resources.getString(R.string.lbl_dimensions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLengthWidth: String? = MyApp.getInstance().resources.getString(R.string.msg_length_width)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtoCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)

)

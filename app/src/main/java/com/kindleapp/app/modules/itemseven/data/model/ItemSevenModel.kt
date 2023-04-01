package com.kindleapp.app.modules.itemseven.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ItemSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtITEMNAME: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStocksleftOu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_stocks_left_ou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_1500_002)
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

package com.kindleapp.app.modules.item3cart.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class Item3CartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_3_000_002)
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
  var txtVanilla: String? = MyApp.getInstance().resources.getString(R.string.lbl_vanilla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVanillaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_vanilla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLemon: String? = MyApp.getInstance().resources.getString(R.string.lbl_lemon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLemonOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lemon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCherry: String? = MyApp.getInstance().resources.getString(R.string.lbl_cherry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCherryOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_cherry)
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
  var txtStocksleftEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stocks_left_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle4241Value: String? = null
)

package com.kindleapp.app.modules.storepageall.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class StorePageAllModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceSix: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_32)

)

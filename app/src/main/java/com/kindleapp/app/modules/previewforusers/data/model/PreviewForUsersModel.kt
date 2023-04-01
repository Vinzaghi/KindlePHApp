package com.kindleapp.app.modules.previewforusers.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class PreviewForUsersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCandleoftheW: String? =
      MyApp.getInstance().resources.getString(R.string.msg_candle_of_the_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtITEMNAME: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhpCounter: String? = MyApp.getInstance().resources.getString(R.string.msg_php_1_500_500_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewArrivals: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_arrivals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKINDLEPH: String? = MyApp.getInstance().resources.getString(R.string.lbl_kindle_ph)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.msg_item_name_32)

)

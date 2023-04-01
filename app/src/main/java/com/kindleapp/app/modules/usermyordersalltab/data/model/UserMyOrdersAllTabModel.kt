package com.kindleapp.app.modules.usermyordersalltab.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class UserMyOrdersAllTabModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToReceive: String? = MyApp.getInstance().resources.getString(R.string.lbl_to_receive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.msg_total_4_item)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_received)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleMiniPotTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_mini_pot2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScentsLavendeOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scents_lavende)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurementThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_50ml)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_58_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQtyCounterFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleScentedOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_scented)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScentsLavendeTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scents_lavende)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_30g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQtyCounterFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceSeven: String? = MyApp.getInstance().resources.getString(R.string.msg_total_3_item)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancelled: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancelled)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleScentedTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_scented2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScentsCherryOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_scents_cherry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_30g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_50_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQtyCounterSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceNine: String? = MyApp.getInstance().resources.getString(R.string.msg_total_1_item2)

)

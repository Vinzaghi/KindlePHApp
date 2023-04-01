package com.kindleapp.app.modules.usermyorderscancelledtab.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class UserMyOrdersCancelledTabModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCancelled: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancelled)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleScented: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_scented)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScentsCherry: String? = MyApp.getInstance().resources.getString(R.string.lbl_scents_cherry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_30g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_50_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQtyCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_total_1_item2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyagainBtn: String? = MyApp.getInstance().resources.getString(R.string.lbl_buy_again)

)

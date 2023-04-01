package com.kindleapp.app.modules.usermyorderstoreceivetab.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class UserMyOrdersToReceiveTabModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToReceive: String? = MyApp.getInstance().resources.getString(R.string.lbl_to_receive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_total_4_item)

)

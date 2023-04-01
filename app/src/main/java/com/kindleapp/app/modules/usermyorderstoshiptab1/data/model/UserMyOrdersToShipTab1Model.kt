package com.kindleapp.app.modules.usermyorderstoshiptab1.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class UserMyOrdersToShipTab1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyOrders: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_orders)

)

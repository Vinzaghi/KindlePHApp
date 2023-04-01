package com.kindleapp.app.modules.usercheckoutconfirmed.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class UserCheckoutConfirmedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWereonit: String? = MyApp.getInstance().resources.getString(R.string.lbl_we_re_on_it)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_payment_ha)

)

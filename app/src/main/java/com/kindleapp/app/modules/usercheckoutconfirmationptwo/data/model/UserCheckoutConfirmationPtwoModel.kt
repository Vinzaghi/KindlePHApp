package com.kindleapp.app.modules.usercheckoutconfirmationptwo.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class UserCheckoutConfirmationPtwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmPayment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_y)

)

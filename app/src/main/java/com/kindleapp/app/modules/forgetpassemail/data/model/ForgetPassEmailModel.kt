package com.kindleapp.app.modules.forgetpassemail.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPassEmailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRESETPASSWORD: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseenteryo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup218Value: String? = null
)

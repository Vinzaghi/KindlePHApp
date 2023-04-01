package com.kindleapp.app.modules.forgetpasspassword.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPassPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRESETPASSWORD: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_change_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup209Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup208Value: String? = null
)

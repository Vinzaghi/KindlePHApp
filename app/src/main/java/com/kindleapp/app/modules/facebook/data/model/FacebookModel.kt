package com.kindleapp.app.modules.facebook.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class FacebookModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogintoyourF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_log_into_your_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFacebookPasswo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_facebook_passwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotnow: String? = MyApp.getInstance().resources.getString(R.string.lbl_not_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpCenter: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_center)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFacebookInc: String? = MyApp.getInstance().resources.getString(R.string.lbl_facebook_inc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup396Value: String? = null
)

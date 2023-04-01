package com.kindleapp.app.modules.loginadminerror.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class LogInAdminErrorModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtADMINLOGIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin_log_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeAdminis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_adminis)
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
  var txtSigninfailed: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_failed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginasUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in_as_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup161Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup160Value: String? = null
)

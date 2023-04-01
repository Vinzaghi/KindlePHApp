package com.kindleapp.app.modules.loginscreen.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class LogInScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLOGIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVia: String? = MyApp.getInstance().resources.getString(R.string.lbl_via)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithFa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_gm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrloginwith: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)
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
  var txtNeedanAccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_need_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginasAdmin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_log_in_as_admin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup316Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup315Value: String? = null
)

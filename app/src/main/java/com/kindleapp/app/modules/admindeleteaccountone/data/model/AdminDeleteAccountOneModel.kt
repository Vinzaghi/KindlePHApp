package com.kindleapp.app.modules.admindeleteaccountone.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class AdminDeleteAccountOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_old_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt12345QwertyOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_12345_qwerty)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSave: String? = MyApp.getInstance().resources.getString(R.string.lbl_save)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_kindle_ph_e_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_account_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOK: String? = MyApp.getInstance().resources.getString(R.string.lbl_ok)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup216Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup215Value: String? = null
)

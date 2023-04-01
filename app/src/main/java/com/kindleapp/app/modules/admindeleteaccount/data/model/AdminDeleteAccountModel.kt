package com.kindleapp.app.modules.admindeleteaccount.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class AdminDeleteAccountModel(
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
  var txtDeleteAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delete_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_kindle_ph_e_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYes: String? = MyApp.getInstance().resources.getString(R.string.lbl_yes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup147Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup146Value: String? = null
)

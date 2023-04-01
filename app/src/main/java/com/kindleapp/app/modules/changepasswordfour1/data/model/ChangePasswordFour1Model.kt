package com.kindleapp.app.modules.changepasswordfour1.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ChangePasswordFour1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSampleUsername: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sample_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_old_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordOne: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_save_successful)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_password_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOK: String? = MyApp.getInstance().resources.getString(R.string.lbl_ok)

)

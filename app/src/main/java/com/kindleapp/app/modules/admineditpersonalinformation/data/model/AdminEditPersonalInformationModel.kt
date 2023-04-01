package com.kindleapp.app.modules.admineditpersonalinformation.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class AdminEditPersonalInformationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditPersonalI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_personal_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup197: String? = MyApp.getInstance().resources.getString(R.string.lbl_username12345)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup200: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup199: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_sampleemail_gma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup196: String? = MyApp.getInstance().resources.getString(R.string.lbl_xxxx_xxxx_xxx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_kindle_ph_e_com)

)

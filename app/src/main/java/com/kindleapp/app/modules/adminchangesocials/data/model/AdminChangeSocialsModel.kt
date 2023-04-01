package com.kindleapp.app.modules.adminchangesocials.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class AdminChangeSocialsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdminSocials: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin_socials)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConnectedSocia: String? =
      MyApp.getInstance().resources.getString(R.string.msg_connected_socia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFacebook: String? = MyApp.getInstance().resources.getString(R.string.lbl_facebook)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_gmail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPinterest: String? = MyApp.getInstance().resources.getString(R.string.lbl_pinterest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwitterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_twitter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_kindle_ph_e_com)

)

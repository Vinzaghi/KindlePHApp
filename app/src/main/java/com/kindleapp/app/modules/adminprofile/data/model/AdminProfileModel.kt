package com.kindleapp.app.modules.adminprofile.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class AdminProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdminProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountInforma: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_informa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername12345: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_username12345)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLinkedSocials: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_linked_socials)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalInform: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_inform)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup122: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup121: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_sampleemail_gma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup119: String? = MyApp.getInstance().resources.getString(R.string.lbl_xxxx_xxxx_xxx)
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

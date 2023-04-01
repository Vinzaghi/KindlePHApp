package com.kindleapp.app.modules.adminsuccessfullyeditpersonalinformation.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class AdminSuccessfullyEditPersonalInformationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditPersonalI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_personal_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup252: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup251: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.msg_sampleemail_gma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactNumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtXxxxxxxxxxx: String? = MyApp.getInstance().resources.getString(R.string.lbl_xxxx_xxxx_xxx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address2)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_save_successful)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_inform2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOK: String? = MyApp.getInstance().resources.getString(R.string.lbl_ok)

)

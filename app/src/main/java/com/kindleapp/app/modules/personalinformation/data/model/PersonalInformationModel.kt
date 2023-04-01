package com.kindleapp.app.modules.personalinformation.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class PersonalInformationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalInform: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_inform)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstName: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSampleNameHer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sample_name_her)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSampleNameHerOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sample_name_her)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSampleNameHerTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sample_name_her)
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
  var txtSampleNameHerThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sample_name_her)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSex: String? = MyApp.getInstance().resources.getString(R.string.lbl_sex)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSampleNameHerFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sample_name_her)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmergencyConta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_emergency_conta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSampleNameHerFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sample_name_her)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmergencyContaOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_emergency_conta2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSampleNameHerSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sample_name_her)

)

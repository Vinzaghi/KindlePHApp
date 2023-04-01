package com.kindleapp.app.modules.google.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class GoogleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_continue_on_kin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotemail: String? = MyApp.getInstance().resources.getString(R.string.lbl_forgot_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_to_continue_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateanaccou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_english)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacy: String? = MyApp.getInstance().resources.getString(R.string.lbl_privacy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTerms: String? = MyApp.getInstance().resources.getString(R.string.lbl_terms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup172Value: String? = null
)

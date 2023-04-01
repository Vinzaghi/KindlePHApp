package com.kindleapp.app.modules.signuppage.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSIGNUP: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIAgreewithth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_agree_with_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup283Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup282Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup281Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup280Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup279Value: String? = null
)

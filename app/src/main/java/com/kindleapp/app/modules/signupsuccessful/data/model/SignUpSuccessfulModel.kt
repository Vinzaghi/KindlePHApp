package com.kindleapp.app.modules.signupsuccessful.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSUCCESSFUL: String? = MyApp.getInstance().resources.getString(R.string.lbl_successful)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_succes)

)

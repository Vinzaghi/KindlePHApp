package com.kindleapp.app.modules.forgetpasssuccessful.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPassSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSUCCESSFUL: String? = MyApp.getInstance().resources.getString(R.string.lbl_successful)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_password_h)

)

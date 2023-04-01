package com.kindleapp.app.modules.customerfeedback.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class CustomerFeedbackModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomerFeedba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_customer_feedba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowdidwedo: String? = MyApp.getInstance().resources.getString(R.string.lbl_how_did_we_do)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatdidyoufi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_did_you_fi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiveusyourfe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_give_us_your_fe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle4263Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle4261Value: String? = null
)

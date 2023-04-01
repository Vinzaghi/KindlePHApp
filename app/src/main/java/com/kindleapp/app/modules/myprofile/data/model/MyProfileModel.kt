package com.kindleapp.app.modules.myprofile.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLeniRobredo: String? = MyApp.getInstance().resources.getString(R.string.lbl_leni_robredo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentOrderDe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recent_order_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.msg_february_31_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleMiniPot: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_mini_pot2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScentsLavende: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scents_lavende)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_50ml)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_58_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX1: String? = MyApp.getInstance().resources.getString(R.string.lbl_x1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleScented: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_scented)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScentsLavendeOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scents_lavende)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_30g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX2: String? = MyApp.getInstance().resources.getString(R.string.lbl_x2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalOrderThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_total_order_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_198_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStatusArrived: String? =
      MyApp.getInstance().resources.getString(R.string.msg_status_arrived)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyOrders: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_orders)
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
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethods: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_methods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApplicationSup: String? =
      MyApp.getInstance().resources.getString(R.string.msg_application_sup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGiveusFeedbac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_give_us_feedbac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatisKINDLE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_kindle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_kindle_ph_e_com)

)

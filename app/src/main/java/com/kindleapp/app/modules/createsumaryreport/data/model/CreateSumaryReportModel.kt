package com.kindleapp.app.modules.createsumaryreport.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class CreateSumaryReportModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSummaryReport: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_summary_report)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_transactions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductsSold: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_products_sold2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleSoyWax: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_soy_wax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsSoldFortyNine: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_items_sold_49)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleBottleC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_bottle_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsSoldFortyNineOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_items_sold_49)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleMiniPot: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_mini_pot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsSoldFortyNineTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_items_sold_49)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleMemorial: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_memorial)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsSoldFortyNineThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_items_sold_49)

)

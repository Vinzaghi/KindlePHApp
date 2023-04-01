package com.kindleapp.app.modules.filterbutton.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class FilterButtonModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekly: String? = MyApp.getInstance().resources.getString(R.string.lbl_weekly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonthly: String? = MyApp.getInstance().resources.getString(R.string.lbl_monthly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYearly: String? = MyApp.getInstance().resources.getString(R.string.lbl_yearly)

)

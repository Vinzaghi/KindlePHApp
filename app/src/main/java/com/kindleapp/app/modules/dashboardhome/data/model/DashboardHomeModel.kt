package com.kindleapp.app.modules.dashboardhome.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardHomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdministrator: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_administrator)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_overall_sales)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPRODUCTSSOLD: String? = MyApp.getInstance().resources.getString(R.string.lbl_products_sold)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemName: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBESTSELLER: String? = MyApp.getInstance().resources.getString(R.string.lbl_best_seller)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sales_per_day)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNewFeat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_feat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomepageforUs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_homepage_for_us)

)

package com.kindleapp.app.modules.createnewfeaturedproduct.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class CreateNewFeaturedProductModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdministrator: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_administrator)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewFeaturedPr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_featured_pr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortDescripti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_short_descripti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductImages: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_product_images)

)

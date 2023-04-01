package com.kindleapp.app.modules.createnewfeaturedproduct.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class GridplusRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddImage: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_image)

)

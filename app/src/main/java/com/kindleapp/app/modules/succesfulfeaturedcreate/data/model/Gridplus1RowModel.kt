package com.kindleapp.app.modules.succesfulfeaturedcreate.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class Gridplus1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddImage: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_image)

)

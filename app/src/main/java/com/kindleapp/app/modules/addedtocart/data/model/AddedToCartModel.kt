package com.kindleapp.app.modules.addedtocart.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class AddedToCartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddedtoCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_added_to_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_ve_successf)

)

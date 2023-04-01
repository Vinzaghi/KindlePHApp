package com.kindleapp.app.modules.delete.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class DeleteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNewProd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_prod)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProducts: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_products)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalInform: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_details_abo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOK: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)

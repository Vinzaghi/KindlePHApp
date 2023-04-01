package com.kindleapp.app.modules.myproducts.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class MyProductsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProducts: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_products)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNewProd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_prod)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleSoyWaxOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_soy_wax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStock15LeftTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stock_15_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup290: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup289: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleSoyWaxTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_soy_wax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStock15LeftThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stock_15_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup296: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup295: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)

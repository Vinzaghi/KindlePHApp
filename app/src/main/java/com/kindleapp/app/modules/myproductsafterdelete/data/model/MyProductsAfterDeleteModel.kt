package com.kindleapp.app.modules.myproductsafterdelete.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class MyProductsAfterDeleteModel(
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
  var txtGroup140: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup139: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)
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
  var txtGroup136: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup135: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKindleSoyWaxThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kindle_soy_wax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStock15LeftFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stock_15_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup138: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup137: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete)

)

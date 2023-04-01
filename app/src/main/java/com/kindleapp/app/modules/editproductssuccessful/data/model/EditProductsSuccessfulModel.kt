package com.kindleapp.app.modules.editproductssuccessful.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class EditProductsSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProducts: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_products)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProduct: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadPhotos: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upload_photo_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddImage: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_image)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameofProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_name_of_product)
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
  var txtQuantityofPro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_quantity_of_pro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionof: String? =
      MyApp.getInstance().resources.getString(R.string.msg_description_of)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_soy_wax_melts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX: String? = MyApp.getInstance().resources.getString(R.string.lbl_x)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteenOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtXOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_x)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnitPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_unit_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScent: String? = MyApp.getInstance().resources.getString(R.string.lbl_scent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeofProduct: String? =
      MyApp.getInstance().resources.getString(R.string.msg_size_of_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup227: String? = MyApp.getInstance().resources.getString(R.string.lbl_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_edit_product_su)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalInform: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_product_ha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOK: String? = MyApp.getInstance().resources.getString(R.string.lbl_okay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup226Value: String? = null
)

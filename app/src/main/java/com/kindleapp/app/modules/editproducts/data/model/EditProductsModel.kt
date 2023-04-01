package com.kindleapp.app.modules.editproducts.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class EditProductsModel(
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
  var txtQuantityofPro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_quantity_of_pro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup276: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
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
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
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
  var txtGroup275: String? = MyApp.getInstance().resources.getString(R.string.lbl_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup277Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup274Value: String? = null
)

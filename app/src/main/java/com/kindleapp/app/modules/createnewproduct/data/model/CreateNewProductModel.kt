package com.kindleapp.app.modules.createnewproduct.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class CreateNewProductModel(
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
  var txtAddImageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_image)
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
  var txtDescriptionof: String? =
      MyApp.getInstance().resources.getString(R.string.msg_description_of)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtL: String? = MyApp.getInstance().resources.getString(R.string.lbl_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX: String? = MyApp.getInstance().resources.getString(R.string.lbl_x)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtW: String? = MyApp.getInstance().resources.getString(R.string.lbl_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtXOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_x)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtH: String? = MyApp.getInstance().resources.getString(R.string.lbl_h)
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
      MyApp.getInstance().resources.getString(R.string.lbl_size_of_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle4296Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle4300Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle4302Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle4306Value: String? = null
)

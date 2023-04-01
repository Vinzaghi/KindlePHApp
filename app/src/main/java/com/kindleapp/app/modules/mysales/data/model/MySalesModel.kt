package com.kindleapp.app.modules.mysales.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class MySalesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMySales: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_sales)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSalesinPesos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sales_in_pesos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductsSold: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_products_sold2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionper: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_per)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateSummary: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewTransactio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_view_transactio)

)

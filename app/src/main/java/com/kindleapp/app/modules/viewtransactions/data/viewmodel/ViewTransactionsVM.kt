package com.kindleapp.app.modules.viewtransactions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.viewtransactions.`data`.model.ListlolRowModel
import com.kindleapp.app.modules.viewtransactions.`data`.model.ViewTransactionsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ViewTransactionsVM : ViewModel(), KoinComponent {
  val viewTransactionsModel: MutableLiveData<ViewTransactionsModel> =
      MutableLiveData(ViewTransactionsModel())

  var navArguments: Bundle? = null

  val listlolList: MutableLiveData<MutableList<ListlolRowModel>> = MutableLiveData(mutableListOf())
}

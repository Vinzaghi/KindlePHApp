package com.kindleapp.app.modules.mysales.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.mysales.`data`.model.MySalesModel
import org.koin.core.KoinComponent

class MySalesVM : ViewModel(), KoinComponent {
  val mySalesModel: MutableLiveData<MySalesModel> = MutableLiveData(MySalesModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.filterbutton.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.filterbutton.`data`.model.FilterButtonModel
import org.koin.core.KoinComponent

class FilterButtonVM : ViewModel(), KoinComponent {
  val filterButtonModel: MutableLiveData<FilterButtonModel> = MutableLiveData(FilterButtonModel())

  var navArguments: Bundle? = null
}

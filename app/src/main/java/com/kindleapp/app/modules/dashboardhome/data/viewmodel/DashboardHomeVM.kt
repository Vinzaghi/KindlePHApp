package com.kindleapp.app.modules.dashboardhome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.dashboardhome.`data`.model.DashboardHomeModel
import org.koin.core.KoinComponent

class DashboardHomeVM : ViewModel(), KoinComponent {
  val dashboardHomeModel: MutableLiveData<DashboardHomeModel> =
      MutableLiveData(DashboardHomeModel())

  var navArguments: Bundle? = null
}

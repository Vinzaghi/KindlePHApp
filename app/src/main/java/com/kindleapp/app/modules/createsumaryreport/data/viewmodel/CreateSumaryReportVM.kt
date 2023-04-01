package com.kindleapp.app.modules.createsumaryreport.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.createsumaryreport.`data`.model.CreateSumaryReportModel
import org.koin.core.KoinComponent

class CreateSumaryReportVM : ViewModel(), KoinComponent {
  val createSumaryReportModel: MutableLiveData<CreateSumaryReportModel> =
      MutableLiveData(CreateSumaryReportModel())

  var navArguments: Bundle? = null
}

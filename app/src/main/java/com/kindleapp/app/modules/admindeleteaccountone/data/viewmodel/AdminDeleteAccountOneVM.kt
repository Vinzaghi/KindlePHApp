package com.kindleapp.app.modules.admindeleteaccountone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.admindeleteaccountone.`data`.model.AdminDeleteAccountOneModel
import org.koin.core.KoinComponent

class AdminDeleteAccountOneVM : ViewModel(), KoinComponent {
  val adminDeleteAccountOneModel: MutableLiveData<AdminDeleteAccountOneModel> =
      MutableLiveData(AdminDeleteAccountOneModel())

  var navArguments: Bundle? = null
}

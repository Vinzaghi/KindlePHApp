package com.kindleapp.app.modules.adminprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.adminprofile.`data`.model.AdminProfileModel
import org.koin.core.KoinComponent

class AdminProfileVM : ViewModel(), KoinComponent {
  val adminProfileModel: MutableLiveData<AdminProfileModel> = MutableLiveData(AdminProfileModel())

  var navArguments: Bundle? = null
}

package com.kindleapp.app.modules.admindeleteaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.admindeleteaccount.`data`.model.AdminDeleteAccountModel
import org.koin.core.KoinComponent

class AdminDeleteAccountVM : ViewModel(), KoinComponent {
  val adminDeleteAccountModel: MutableLiveData<AdminDeleteAccountModel> =
      MutableLiveData(AdminDeleteAccountModel())

  var navArguments: Bundle? = null
}

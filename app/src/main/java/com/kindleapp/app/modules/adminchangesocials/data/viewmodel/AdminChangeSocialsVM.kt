package com.kindleapp.app.modules.adminchangesocials.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.adminchangesocials.`data`.model.AdminChangeSocialsModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class AdminChangeSocialsVM : ViewModel(), KoinComponent {
  val adminChangeSocialsModel: MutableLiveData<AdminChangeSocialsModel> =
      MutableLiveData(AdminChangeSocialsModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()
}

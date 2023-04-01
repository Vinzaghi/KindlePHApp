package com.kindleapp.app.modules.facebook.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.facebook.`data`.model.FacebookModel
import org.koin.core.KoinComponent

class FacebookVM : ViewModel(), KoinComponent {
  val facebookModel: MutableLiveData<FacebookModel> = MutableLiveData(FacebookModel())

  var navArguments: Bundle? = null
}

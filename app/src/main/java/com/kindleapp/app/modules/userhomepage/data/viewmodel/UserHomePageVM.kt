package com.kindleapp.app.modules.userhomepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.userhomepage.`data`.model.UserHomePageModel
import org.koin.core.KoinComponent

class UserHomePageVM : ViewModel(), KoinComponent {
  val userHomePageModel: MutableLiveData<UserHomePageModel> = MutableLiveData(UserHomePageModel())

  var navArguments: Bundle? = null
}

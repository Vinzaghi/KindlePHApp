package com.kindleapp.app.modules.aboutpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.aboutpage.`data`.model.AboutPageModel
import org.koin.core.KoinComponent

class AboutPageVM : ViewModel(), KoinComponent {
  val aboutPageModel: MutableLiveData<AboutPageModel> = MutableLiveData(AboutPageModel())

  var navArguments: Bundle? = null
}

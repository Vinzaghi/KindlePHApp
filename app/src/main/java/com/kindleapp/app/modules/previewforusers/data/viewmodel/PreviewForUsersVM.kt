package com.kindleapp.app.modules.previewforusers.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.previewforusers.`data`.model.PreviewForUsersModel
import org.koin.core.KoinComponent

class PreviewForUsersVM : ViewModel(), KoinComponent {
  val previewForUsersModel: MutableLiveData<PreviewForUsersModel> =
      MutableLiveData(PreviewForUsersModel())

  var navArguments: Bundle? = null
}

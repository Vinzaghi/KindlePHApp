package com.kindleapp.app.modules.personalinformationsave.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.personalinformationsave.`data`.model.PersonalInformationSaveModel
import org.koin.core.KoinComponent

class PersonalInformationSaveVM : ViewModel(), KoinComponent {
  val personalInformationSaveModel: MutableLiveData<PersonalInformationSaveModel> =
      MutableLiveData(PersonalInformationSaveModel())

  var navArguments: Bundle? = null
}

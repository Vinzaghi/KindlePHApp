package com.kindleapp.app.modules.personalinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.personalinformation.`data`.model.PersonalInformationModel
import org.koin.core.KoinComponent

class PersonalInformationVM : ViewModel(), KoinComponent {
  val personalInformationModel: MutableLiveData<PersonalInformationModel> =
      MutableLiveData(PersonalInformationModel())

  var navArguments: Bundle? = null
}

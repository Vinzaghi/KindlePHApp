package com.kindleapp.app.modules.personalinformationclear.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.personalinformationclear.`data`.model.PersonalInformationClearModel
import org.koin.core.KoinComponent

class PersonalInformationClearVM : ViewModel(), KoinComponent {
  val personalInformationClearModel: MutableLiveData<PersonalInformationClearModel> =
      MutableLiveData(PersonalInformationClearModel())

  var navArguments: Bundle? = null
}

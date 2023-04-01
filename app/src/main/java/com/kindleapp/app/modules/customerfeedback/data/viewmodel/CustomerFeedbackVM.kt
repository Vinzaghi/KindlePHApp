package com.kindleapp.app.modules.customerfeedback.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.customerfeedback.`data`.model.CustomerFeedbackModel
import org.koin.core.KoinComponent

class CustomerFeedbackVM : ViewModel(), KoinComponent {
  val customerFeedbackModel: MutableLiveData<CustomerFeedbackModel> =
      MutableLiveData(CustomerFeedbackModel())

  var navArguments: Bundle? = null
}

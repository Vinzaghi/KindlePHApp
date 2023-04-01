package com.kindleapp.app.modules.usermyorderstoreceivetab.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usermyorderstoreceivetab.`data`.model.Listkindlememoryc1RowModel
import com.kindleapp.app.modules.usermyorderstoreceivetab.`data`.model.UserMyOrdersToReceiveTabModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UserMyOrdersToReceiveTabVM : ViewModel(), KoinComponent {
  val userMyOrdersToReceiveTabModel: MutableLiveData<UserMyOrdersToReceiveTabModel> =
      MutableLiveData(UserMyOrdersToReceiveTabModel())

  var navArguments: Bundle? = null

  val listkindlememorycList: MutableLiveData<MutableList<Listkindlememoryc1RowModel>> =
      MutableLiveData(mutableListOf())
}

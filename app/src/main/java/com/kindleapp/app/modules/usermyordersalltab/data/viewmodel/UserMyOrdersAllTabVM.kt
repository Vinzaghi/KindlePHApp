package com.kindleapp.app.modules.usermyordersalltab.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usermyordersalltab.`data`.model.ListkindlememorycRowModel
import com.kindleapp.app.modules.usermyordersalltab.`data`.model.ListtopayRowModel
import com.kindleapp.app.modules.usermyordersalltab.`data`.model.UserMyOrdersAllTabModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UserMyOrdersAllTabVM : ViewModel(), KoinComponent {
  val userMyOrdersAllTabModel: MutableLiveData<UserMyOrdersAllTabModel> =
      MutableLiveData(UserMyOrdersAllTabModel())

  var navArguments: Bundle? = null

  val listtopayList: MutableLiveData<MutableList<ListtopayRowModel>> =
      MutableLiveData(mutableListOf())

  val listkindlememorycList: MutableLiveData<MutableList<ListkindlememorycRowModel>> =
      MutableLiveData(mutableListOf())
}

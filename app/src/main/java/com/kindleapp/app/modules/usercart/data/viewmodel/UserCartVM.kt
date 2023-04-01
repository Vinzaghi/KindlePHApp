package com.kindleapp.app.modules.usercart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kindleapp.app.modules.usercart.`data`.model.UserCartModel
import com.kindleapp.app.modules.usercart.`data`.model.UserCartRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UserCartVM : ViewModel(), KoinComponent {
  val userCartModel: MutableLiveData<UserCartModel> = MutableLiveData(UserCartModel())

  var navArguments: Bundle? = null

  val userCartList: MutableLiveData<MutableList<UserCartRowModel>> =
      MutableLiveData(mutableListOf())
}

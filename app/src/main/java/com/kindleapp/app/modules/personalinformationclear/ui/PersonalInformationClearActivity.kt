package com.kindleapp.app.modules.personalinformationclear.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityPersonalInformationClearBinding
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.personalinformationclear.`data`.viewmodel.PersonalInformationClearVM
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class PersonalInformationClearActivity :
    BaseActivity<ActivityPersonalInformationClearBinding>(R.layout.activity_personal_information_clear)
    {
  private val viewModel: PersonalInformationClearVM by viewModels<PersonalInformationClearVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalInformationClearVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PERSONAL_INFORMATION_CLEAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalInformationClearActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

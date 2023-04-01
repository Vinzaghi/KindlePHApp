package com.kindleapp.app.modules.personalinformation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityPersonalInformationBinding
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.personalinformation.`data`.viewmodel.PersonalInformationVM
import com.kindleapp.app.modules.personalinformationclear.ui.PersonalInformationClearActivity
import com.kindleapp.app.modules.personalinformationsave.ui.PersonalInformationSaveActivity
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class PersonalInformationActivity :
    BaseActivity<ActivityPersonalInformationBinding>(R.layout.activity_personal_information) {
  private val viewModel: PersonalInformationVM by viewModels<PersonalInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnClear.setOnClickListener {
      val destIntent = PersonalInformationClearActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = PersonalInformationSaveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PERSONAL_INFORMATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalInformationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

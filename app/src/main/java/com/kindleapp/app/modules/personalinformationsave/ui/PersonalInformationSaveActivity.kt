package com.kindleapp.app.modules.personalinformationsave.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.databinding.ActivityPersonalInformationSaveBinding
import com.kindleapp.app.modules.myprofile.ui.MyProfileActivity
import com.kindleapp.app.modules.personalinformationsave.`data`.viewmodel.PersonalInformationSaveVM
import com.kindleapp.app.modules.usercart.ui.UserCartActivity
import kotlin.String
import kotlin.Unit

class PersonalInformationSaveActivity :
    BaseActivity<ActivityPersonalInformationSaveBinding>(R.layout.activity_personal_information_save)
    {
  private val viewModel: PersonalInformationSaveVM by viewModels<PersonalInformationSaveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalInformationSaveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageShoppingCart.setOnClickListener {
      val destIntent = UserCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSheet.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PERSONAL_INFORMATION_SAVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalInformationSaveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.kindleapp.app.modules.adminchangesocials.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.base.BaseActivity
import com.kindleapp.app.appcomponents.facebookauth.FacebookHelper
import com.kindleapp.app.databinding.ActivityAdminChangeSocialsBinding
import com.kindleapp.app.modules.adminchangesocials.`data`.viewmodel.AdminChangeSocialsVM
import com.kindleapp.app.modules.adminprofile.ui.AdminProfileActivity
import com.kindleapp.app.modules.dashboardhome.ui.DashboardHomeActivity
import com.kindleapp.app.modules.myproducts.ui.MyProductsActivity
import com.kindleapp.app.modules.mysales.ui.MySalesActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AdminChangeSocialsActivity :
    BaseActivity<ActivityAdminChangeSocialsBinding>(R.layout.activity_admin_change_socials) {
  private val viewModel: AdminChangeSocialsVM by viewModels<AdminChangeSocialsVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminChangeSocialsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageProduct.setOnClickListener {
      val destIntent = MyProductsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUser.setOnClickListener {
      val destIntent = AdminProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowfblogoone.setOnClickListener {
      LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
      facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
        override fun onSuccess(result: LoginResult?) {
        }
        override fun onError(error: FacebookException?) {
        }
        override fun onCancel() {
        }
        })
      }
      binding.imageTotalSales.setOnClickListener {
        val destIntent = MySalesActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageHomePage.setOnClickListener {
        val destIntent = DashboardHomeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "ADMIN_CHANGE_SOCIALS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, AdminChangeSocialsActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

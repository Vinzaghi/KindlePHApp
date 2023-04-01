package com.kindleapp.app.modules.aboutpage.`data`.model

import com.kindleapp.app.R
import com.kindleapp.app.appcomponents.di.MyApp
import kotlin.String

data class AboutPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMEETTHEOWNERS: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_meet_the_owners)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJaneDDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_jane_d_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJaneDDoeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_jane_d_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJaneDDoeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_jane_d_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOURSTORY: String? = MyApp.getInstance().resources.getString(R.string.lbl_our_story)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFOLLOWUS: String? = MyApp.getInstance().resources.getString(R.string.lbl_follow_us)

)

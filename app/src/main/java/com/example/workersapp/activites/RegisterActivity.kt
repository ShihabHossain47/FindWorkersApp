package com.example.workersapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.WindowManager
import android.widget.TextView
import com.example.workersapp.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }

        val loginText=findViewById<TextView>(R.id.tv_login)
        loginText.setOnClickListener{
            val change_activity= Intent(this, LoginActivity::class.java)
            startActivity(change_activity)
            finish()
        }


   }

//    private fun validateRegisterDetails(): Boolean {
//        return when {
//            TextUtils.isEmpty(et_first_name.text.toString().trim { it <= ' ' }) -> {
//                showErrorSnackBar(resources.getString(R.string.err_msg_enter_first_name), true)
//                false
//            }
//
//            TextUtils.isEmpty(et_last_name.text.toString().trim { it <= ' ' }) -> {
//                showErrorSnackBar(resources.getString(R.string.err_msg_enter_last_name), true)
//                false
//            }
//
//            TextUtils.isEmpty(et_email.text.toString().trim { it <= ' ' }) -> {
//                showErrorSnackBar(resources.getString(R.string.err_msg_enter_email), true)
//                false
//            }
//
//            TextUtils.isEmpty(et_password.text.toString().trim { it <= ' ' }) -> {
//                showErrorSnackBar(resources.getString(R.string.err_msg_enter_password), true)
//                false
//            }
//
//            TextUtils.isEmpty(et_confirm_password.text.toString().trim { it <= ' ' }) -> {
//                showErrorSnackBar(resources.getString(R.string.err_msg_enter_confirm_password), true)
//                false
//            }
//
//            et_password.text.toString().trim { it <= ' ' } != et_confirm_password.text.toString()
//                .trim { it <= ' ' } -> {
//                showErrorSnackBar(resources.getString(R.string.err_msg_password_and_confirm_password_mismatch), true)
//                false
//            }
//            !cb_terms_and_condition.isChecked -> {
//                showErrorSnackBar(resources.getString(R.string.err_msg_agree_terms_and_condition), true)
//                false
//            }
//            else -> {
//                showErrorSnackBar("Your details are valid.", false)
//                true
//            }
//        }
//    }


}

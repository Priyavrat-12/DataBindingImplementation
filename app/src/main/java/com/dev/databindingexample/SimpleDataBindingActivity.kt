package com.dev.databidingexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.dev.databindingexample.R
import com.dev.databindingexample.databinding.ActivityMainBinding

class SimpleDataBindingActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var bindingActivity: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingActivity = DataBindingUtil.setContentView(this, R.layout.activity_main)

        bindingActivity.apply {

            val oneWayDataBindingBtn = oneWayDataBindingBtn
            val twoWayDataBindingBtn = twoWayDataBindingBtn

            oneWayDataBindingBtn.setOnClickListener(this@SimpleDataBindingActivity)
            twoWayDataBindingBtn.setOnClickListener(this@SimpleDataBindingActivity)

            val submitButton: Button = submitBtn

            submitButton.setOnClickListener {
                val usernameText: String = usernameET.text.toString()
                val passwordText = passwordET.text.toString()
                Toast.makeText(applicationContext, "Example of basic data binding,\nUsername $usernameText and password $passwordText", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onClick(view: View) {
        val id = view.id

        when (id) {

            bindingActivity.oneWayDataBindingBtn.id -> startActivity(Intent(applicationContext, OneWayDataBindingActivity::class.java))

            bindingActivity.twoWayDataBindingBtn.id -> startActivity(Intent(applicationContext, TwoWayDataBindingActivity::class.java))

            else -> {
                Log.i("DataBinding", "Unable to handle the click event")
            }
        }
    }
}
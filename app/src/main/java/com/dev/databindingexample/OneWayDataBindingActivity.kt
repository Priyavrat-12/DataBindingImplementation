package com.dev.databidingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dev.databidingexample.models.Student
import com.dev.databindingexample.R
import com.dev.databindingexample.databinding.ActivityOneWayDataBindingBinding

class OneWayDataBindingActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityOneWayDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_one_way_data_binding)
        dataBinding.student = getStudentData()

    }

    private fun getStudentData(): Student {
        return Student(1, "Priyavrat")
    }
}
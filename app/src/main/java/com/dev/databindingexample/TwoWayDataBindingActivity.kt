package com.dev.databidingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dev.databidingexample.viewmodels.MyDataBindingViewModel
import com.dev.databindingexample.R
import com.dev.databindingexample.databinding.ActivityTwoWayDataBindingBinding

class TwoWayDataBindingActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityTwoWayDataBindingBinding

    private lateinit var myDataBindingViewModel: MyDataBindingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_data_binding)

        myDataBindingViewModel = ViewModelProvider(this).get(MyDataBindingViewModel::class.java)

        dataBinding.myViewModelData = myDataBindingViewModel

        dataBinding.lifecycleOwner = this
    }
}
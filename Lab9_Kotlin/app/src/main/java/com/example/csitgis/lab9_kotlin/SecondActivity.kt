package com.example.csitgis.lab9_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receiveData = intent.extras.getParcelable(MainActivity.KEY_DATA_STUDENT)as Student

        text_view_result_id_std.text = "ID : ${receiveData.id}"
        text_view_result_first_name.text = "First Name : ${receiveData.firstname}"
        text_view_result_last_name.text = "Last Name : ${receiveData.lastname}"
    }
}

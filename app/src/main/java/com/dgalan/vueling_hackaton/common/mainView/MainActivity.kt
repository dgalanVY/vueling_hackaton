package com.dgalan.vueling_hackaton.common.mainView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dgalan.vueling_hackaton.R.layout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }
}
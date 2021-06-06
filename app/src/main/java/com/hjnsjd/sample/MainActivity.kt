package com.hjnsjd.sample

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.hjnsjd.sample.databinding.ActivityMainBinding

/**
 * DataBinding 사용하는 법 www.ienlab.net/entry/안드로이드-Unresolved-reference-오류-데이터바인딩-사용하기
 */

val TAG = "sampleTAG"

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this

//        val textView: TextView = findViewById(R.id.textView)
//        textView.text = "김형진"
//        binding.textview.setTextColor(Color.BLUE)
//        binding.textview.


//        var a="과로사"
//        binding.view1


    }

}
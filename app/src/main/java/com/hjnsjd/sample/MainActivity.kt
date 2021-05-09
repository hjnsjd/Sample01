package com.hjnsjd.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val TAG = "sampleTAG"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "hello world")

        var m=10
        var fm=10

//        if(m>fm){
//            Log.d(TAG, "남초")
//        }
//        else if(m<fm){
//            Log.d(TAG, "여초")
//
//        }
//        else{
//            Log.d(TAG,"1대1")
//        }

        when{
            m==fm->{
                Log.d(TAG, "1대1")
            }
            m<fm->{
                Log.d(TAG, "여초")
            }
            else->{
                Log.d(TAG, "남초")
            }

        }
    }
}
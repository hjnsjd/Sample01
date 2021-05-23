package com.hjnsjd.sample

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val TAG = "sampleTAG"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "hello world")

        var m = 10
        var fm = 10

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

//        when{
//            m==fm->{
//                Log.d(TAG, "1대1")
//            }
//            m<fm->{
//                Log.d(TAG, "여초")
//            }
//            else->{
//                Log.d(TAG, "남초")
//            }
//
//        }
//        for (i in 5 downTo 0){
//            Log.d(TAG, "${i}")
//        }

//        for (a in 2 until 11 step 2){
//            Log.d(TAG, "멍청이 ${a}명")
//        }
//        var a=2
//        while(a<=10){
//            Log.d(TAG, "멍청이 ${a}")
//            a+=2
//        }
//        for(i in 1 until 10) {
//            for (j in 1 until 10){
//                Log.d(TAG, "$i * ${j}= ${i*j}")
//            }
//        }
//
//        val arr = listOf("Hello", "world", "hui")
//        val arr2 = arrayListOf("Hello", "IENGROUND","hjnsjd")

//        arr2.add

//        arr[0] = "hjnsjd"
//        arr2[0] = "hjnsjd"

//        arr.add("형진")
//        arr.removeAt(1)
//        arr2.add("형진")
//        arr2.removeAt(1)
//
//        for (i in arr) {
//            Log.d(TAG, i)
//        }
//
//        for (i in arr2) {
//            Log.d(TAG, i)
//        }
//
//        arr2.add(1 ,"hi")
//
//        for (i in arr2) {
//            Log.d(TAG, i)
//        }
//
////        val name = arrayListOf("이현우", "김형진", "김소미", "이지은")
////
////        for (i in name) {
////            Log.d(TAG, i)
////        }
//
//
////        val arr = arrayListOf<Int>()
////        val arr2 = arrayListOf(2, 5, 10)
////        var sum=0
////
////        var max=-1
////        var min=101
////        val arr = arrayListOf(100, 68, 80, 52, 60, 55, 96, 92, 89, 69)
////        for (a in arr) {
////            if(max<a) max=a
////            if(min>a) min=a
////            sum+=a
////
////        }
////        Log.d(TAG,"max=$max, min=$min, avg=${sum / (arr.size.toFloat())}")
////
////        sum(4, 5)
////
//////        max.sum2()
////        arr.sum2()
//
////        Log.d ( TAG,sum (1,2).toString())
//        Log.d(TAG, mySum(1).toString())
//
//        Log.d(TAG, mySum(1, 2).toString())
//
//        Log.d(TAG, mySum(1, 5,3, 2, 6).toString())
//
//        val myArray = arrayListOf(100, 20, 3)
//        Log.d(TAG, sum(1, 2).toString())
//        Log.d(TAG, sum(1.0f, 2.0f).toString())
//        Log.d(TAG, sum(1, 2, 3).toString())

        val animal = Animal(true, 10)
        animal.printAge()
        animal.printGender()
        animal.eat("피자")
        animal.sleep(5)

        val animal2 = Animal(false, 20)
        animal2.eat("햄버거")
        animal2.printAge()

        val human = Human("김형진", "1234", true, 17)
        human.eat("밥")
        human.sleep(7)
        human.printAge()
        human.printGender()
    }

    fun sum(a: Int, b: Int): Int {
        Log.d(TAG, "int sum")
        return a + b
    }

    fun sum(a: Int, b: Int, c: Int): Int {
        Log.d(TAG, "int sum 3")
        return a + b + c
    }

    fun sum(a: Float, b: Float): Float {
        Log.d(TAG, "float sum")
        return a + b
    }




}
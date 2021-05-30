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

        val animal = Animal(5, 0, "A")
        animal.breathe()

        animal.move(50)
        val human = Human(5, 1, "Ba", "050801", "USA")
        human.talk()
        human.eat("사과")
        human.think()

        val student = Student(10, 0, "hjn", "050801", "Korea", 10505, 90f)


        if (student.test("math")) {
            Log.d(TAG, "시험을 잘 쳤다.")
        } else {
            Log.d(TAG, "시험을 못 쳤다.")
        }


    }

}
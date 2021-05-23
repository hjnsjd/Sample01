package com.hjnsjd.sample

import android.util.Log

open class Animal(var age: Int, var gender: Int, var name: String){
    fun breathe() {
        Log.d(TAG, "${name}는 숨을 쉰다")
    }

    fun move(length: Int) {
        Log.d(TAG, "${name}은 ${length}만큼 움직였다")
    }

    fun eat(food: String){
        Log.d(TAG, "${name}은 ${food}를 먹는다")
    }

}

open class Human(age: Int, gender: Int, name: String, var id:String, var country:String):Animal(age,gender,name){
    fun think(){
        Log.d(TAG,"${name}은 생각한다")
    }
    fun talk(){
        Log.d(TAG,"${name}은 생각을 말할수 있다")
    }
}

class Student(age: Int, gender: Int, name: String, id:String,  country:String, var student_id:Int, var score:Float):Human(age,gender, name, id, country){
    fun study(subject:String){
        Log.d(TAG, "${student_id} ${name}은 ${subject}를 공부하였다")
    }
    fun test(subject:String):Boolean{
        Log.d(TAG,"${student_id} ${name}은 ${subject}의 시험을 쳤고 ${score}의 점수를 맞았다")

        return score>=80

    }
}



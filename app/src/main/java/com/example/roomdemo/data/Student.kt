package com.example.roomdemo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "student_table")
data class Student(
     @PrimaryKey(autoGenerate = true)
     val id:Int,
     val name:String,
     val programme:String) {

}
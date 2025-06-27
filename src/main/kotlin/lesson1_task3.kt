package org.example

fun main(){
    // Изменил тип переменных даты на String
    val year = "1961"
    var hour = "09"
    var minute = "07"
    println("Год полета: $year")
    println("Час полета: $hour")
    println("Минуты полета: $minute")
    hour = "10"
    minute = "55"
    println("Время посадки $hour:$minute")
}
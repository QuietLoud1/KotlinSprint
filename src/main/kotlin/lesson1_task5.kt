package org.example

fun main() {
    var length: Long = 40868600000
    var age: Byte = 27
    var partOfDay: Double = 0.075
    var seconds: Int = 6480
    var partOfYear: Float = 2.0547945205479453E-4f
    var apogee: Int = 327000
//    println("Расстояние: $length")
//    println("Возраст: $age")
//    println("Часть дня: $partOfDay")
//    println("Секунды: $seconds")
//    println("Часть года: $partOfYear")
//    println("Апогей орбиты: $apogee")
    var hours = seconds /60/60
    var minutes = seconds /60%60
    seconds = seconds %60%60
    println("Время: 0$hours:$minutes:0$seconds")

}
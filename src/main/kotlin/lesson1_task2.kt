package org.example

fun main() {
    val orders: Int = 75
    val gratitudeText: String = "Спасибо за покупку в нашем интернет магазине!"
    println(
        "Заказы: $orders" +
                "\nБлагодарность: $gratitudeText"
    )
    var workers = 2000
    // println("Количество работников: $workers")
    workers -= 1
    println("Количество работников: $workers")
}
package org.example

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffMultiplier = 0.2

    val additionalCrystalOre = (crystalOre * buffMultiplier).toInt()
    val additionalIronOre = (ironOre * buffMultiplier).toInt()

    println("Добыто кристаллов - $crystalOre. BUFF! Вы получили $additionalCrystalOre кристалл дополнительно.")
    println("Добыто железной руды - $ironOre. BUFF! Вы получили $additionalIronOre железо дополнительно.")
}
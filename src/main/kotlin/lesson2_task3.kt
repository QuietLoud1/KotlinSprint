fun main() {

    val hourStart = 9
    val minutesStart = 39
    val minutesInTransit = 457

    val hourEnd = hourStart + (minutesStart + minutesInTransit) / 60
    val minutesEnd = (minutesStart + minutesInTransit) % 60
    println("Время прибытия: $hourEnd:$minutesEnd")
}


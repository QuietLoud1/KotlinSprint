import java.lang.String.format
import kotlin.math.pow

fun main() {
    var clientDeposit = 70000
    var interestRate = 16.7
    var yearsInDeposit = 20

    var result = 70000*(1+16.7/100).pow(20)
    println(format("%.3f",result))
    // Нашел интересное решение проблемы XD. Но наверно это не то, что от меня требовалось.
    // Как правильно бы было сделать 3 знака после разделителя? Подскажите пожалуйста
}
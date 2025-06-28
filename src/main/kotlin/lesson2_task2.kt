package org.example

fun main() {

    var employeesSalary = 50*30000
    var expensesWithInterns = employeesSalary + 30*20000
    var averageSalaryWithInterns = expensesWithInterns/(50+30)

    println("Затраты на зп полноценных сотрудников: $employeesSalary")
    println("Затраты на зп с приходом стажеров в компанию: $expensesWithInterns")
    println("Средняя зарплата в компании после найма стажеров: $averageSalaryWithInterns")

}
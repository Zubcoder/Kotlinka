// Мой средний балл из диплома, посчитанный кодом.
// Урок 4, 9 ноября 2026.

fun main() {
    val grades = listOf(5, 4, 5, 4, 4, 5, 5, 4, 4, 5, 5, 5, 5, 4, 3, 5, 5, 5,
                        4, 5, 5, 3, 4, 4, 4, 5, 5, 5, 5,
                        5, 5, 5, 4)            // grades — оценки; listOf — «список из»
    var sum = 0                                // sum — сумма
    var count = 0                              // count — количество

    for (g in grades) {                        // для каждой оценки g в списке grades
        sum = sum + g
        count = count + 1
    }

    val avg = sum.toDouble() / count           // avg = average, среднее; toDouble — в дробное число
    println("Сумма: $sum")                     // 150
    println("Оценок: $count")                  // 33
    println("Средний балл: ${"%.2f".format(avg)}")   // format — оформить; 2 знака после запятой
}

// лямбда — маленькая функция без имени в { }
// it — «оно», очередной элемент; можно назвать по-своему: { n -> ... }
// filter — отбери, forEach — для каждого, map — преврати
// count — сосчитай, sumOf — сложи; brick — кирпичик, isOpen — открыт ли

data class Cat(val name: String, val age: Int)
data class Brick(val name: String, val color: String, val isOpen: Boolean)
data class Lesson(val title: String, val score: Int)   // lesson — урок, title — название, score — оценка

fun main() {
    val nums = listOf(3, 8, 1, 10, 5)
    val big = nums.filter { it > 4 }            // [8, 10, 5] — отобрали
    println(big)
    println(nums.filter { n -> n > 4 })         // то же самое, своё имя вместо it
    big.forEach { println(it * 2) }             // 16, 20, 10 — сделали с каждым

    val cats = listOf(Cat("Барсик", 7), Cat("Мурка", 4), Cat("Рыжик", 1))
    println(cats.map { it.name })               // [Барсик, Мурка, Рыжик] — превратили
    println(cats.count { it.age > 3 })          // 2 — сколько подходит
    println(cats.sumOf { it.age })              // 12 — сумма возрастов

    val bricks = listOf(
        Brick("Коробка", "жёлтый", true),
        Brick("Цикл", "бирюзовый", true),
        Brick("Условие", "оранжевый", false),
        Brick("Функция", "фиолетовый", false)
    )
    val openNames = bricks.filter { it.isOpen }.map { it.name }   // цепочка: отбери, потом преврати
    println(openNames)                          // [Коробка, Цикл]
    println(bricks.count { it.isOpen })         // 2
    bricks.forEach { brick ->
        println("${brick.name} — ${brick.color}")
    }

    // закрепление: уроки
    val lessons = listOf(
        Lesson("Переменные", 5),
        Lesson("Циклы", 4),
        Lesson("Классы", 3),
        Lesson("Лямбды", 5)
    )
    println(lessons.map { it.title })                               // [Переменные, Циклы, Классы, Лямбды]
    println(lessons.count { it.score == 5 })                        // 2 — уроков на пятёрку
    println(lessons.sumOf { it.score })                             // 17 — сумма оценок
    println(lessons.filter { it.score == 5 }.map { it.title })      // [Переменные, Лямбды]
    val avg = lessons.sumOf { it.score }.toDouble() / lessons.size  // avg (average) — среднее; size — сколько уроков
    println(avg)                                                    // 4.25
}

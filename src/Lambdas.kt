// лямбда — маленькая функция без имени в { }
// it — «оно», очередной элемент; можно назвать по-своему: { n -> ... }
// filter — отбери, forEach — для каждого, map — преврати
// count — сосчитай, sumOf — сложи; brick — кирпичик, isOpen — открыт ли

data class Cat(val name: String, val age: Int)
data class Brick(val name: String, val color: String, val isOpen: Boolean)

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
}

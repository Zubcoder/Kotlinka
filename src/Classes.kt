// class — класс, чертёж; data — данные (печатается красиво)
// ? после типа — может быть пусто (null), ?: — «а если пусто, то…»
// brick — кирпичик, isOpen — открыт ли, owner — хозяин
// lesson — урок, title — заголовок, score — оценка

data class Cat(val name: String, val age: Int)
data class Brick(val name: String, val color: String, val isOpen: Boolean)
data class Owned(val name: String, val owner: String?)
data class Lesson(val title: String, val score: Int?)

fun main() {
    val barsik = Cat("Барсик", 3)
    println(barsik.name)                 // Барсик — точка: «у Барсика взять имя»
    println(barsik)                      // Cat(name=Барсик, age=3) — благодаря data

    val cats = listOf(Cat("Барсик", 3), Cat("Мурка", 5), Cat("Рыжик", 1), Cat("Пушок", 7))
    for (c in cats) {
        if (c.age > 3) {                 // >= 3 добавит Барсика
            println(c.name)              // Мурка, Пушок
        }
    }

    val bricks = listOf(
        Brick("Коробка", "жёлтый", true),
        Brick("Цикл", "бирюзовый", true),
        Brick("Условие", "оранжевый", false)
    )
    for (b in bricks) {
        if (b.isOpen) {                  // без == true: isOpen уже «да» или «нет»
            println("${b.name} — ${b.color}")
        }
    }

    val ryzhik = Owned("Рыжик", null)    // без ? Kotlin не даст положить null
    println("Кот ${ryzhik.name} ${ryzhik.owner ?: "уличный"}")

    // уроки «Кодёнка» (сам)
    val lessons = listOf(
        Lesson("Переменные", 5),
        Lesson("Циклы", 4),
        Lesson("Классы", null)
    )
    for (lesson in lessons) {
        println("${lesson.title}: ${lesson.score ?: "не пройден"}")
    }
}

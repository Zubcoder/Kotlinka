// sorted — отсортированный, by — по чему; descending — по убыванию
// first — первый; lesson — урок, title — название, score — оценка
// Сортировка даёт НОВЫЙ список, старый не меняется. Одинаковые остаются в исходном порядке.

data class Cat(val name: String, val age: Int)
data class Lesson(val title: String, val score: Int)

fun main() {
    val cats = listOf(Cat("Барсик", 7), Cat("Мурка", 4), Cat("Рыжик", 1), Cat("Пушок", 5))

    val young = cats.sortedBy { it.age }                 // от младшего к старшему
    println(young.map { it.name })                       // [Рыжик, Мурка, Пушок, Барсик]

    val old = cats.sortedByDescending { it.age }         // от старшего к младшему
    println(old.map { it.name })                         // [Барсик, Пушок, Мурка, Рыжик]

    println(cats.sortedBy { it.name }.map { it.name })   // по алфавиту: [Барсик, Мурка, Пушок, Рыжик]
    println(cats.filter { it.age > 3 }.sortedBy { it.age }.map { it.name })   // [Мурка, Пушок, Барсик]

    // закрепление: уроки «Кодёнка»
    val lessons = listOf(
        Lesson("Переменные", 5),
        Lesson("Циклы", 4),
        Lesson("Классы", 3),
        Lesson("Лямбды", 5),
        Lesson("Сортировка", 4)
    )
    println(lessons.sortedByDescending { it.score }.map { it.title })   // [Переменные, Лямбды, Циклы, Сортировка, Классы]

    val best = lessons.sortedByDescending { it.score }.first()          // лучший урок
    println(best.title)                                                  // Переменные — при равных оценках порядок исходный

    println(lessons.filter { it.score >= 4 }.sortedBy { it.title }.map { it.title })   // [Лямбды, Переменные, Сортировка, Циклы]
}

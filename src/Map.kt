// map — карта, словарь «ключ → значение», to — пара ключ → значение
// mutable — изменяемый, in — в (есть ли ключ), null — ничего, пусто
// ?: — «а если пусто, то…», colors — цвета, words — слова

fun main() {
    val colors = mapOf(
        "коробка" to "жёлтый",
        "цикл" to "бирюзовый",
        "условие" to "оранжевый"
    )
    println(colors["цикл"])                  // бирюзовый — ищем по ключу, а не по номеру
    println(colors.size)                     // 3 — size считает пары
    println(colors["функция"])               // null — ключа нет, но программа не падает
    println(colors["функция"] ?: "серый")    // серый — запас, если пусто

    val words = mutableMapOf(
        "add" to "добавить",
        "size" to "размер"
    )
    words["when"] = "когда"                  // нового ключа нет — пара добавилась
    words["size"] = "количество"             // ключ уже есть — значение заменилось
    println(words["size"])                   // количество
    println(words.size)                      // 3, а не 4
    println("when" in words)                 // true
    println("remove" in words)               // false

    // цвета кодпичиков в «Кодёнке» (сам)
    val bricks = mutableMapOf(
        "коробка" to "жёлтый",
        "цикл" to "бирюзовый",
        "условие" to "оранжевый"
    )
    bricks["функция"] = "фиолетовый"         // ученик открыл новую тему
    println(bricks["функция"])               // фиолетовый
    println(bricks["привет"] ?: "серый")     // серый
    println("цикл" in bricks)                // true
    println(bricks.size)                     // 4
}

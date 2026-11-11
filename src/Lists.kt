// Списки: считаю, сколько палиндромов в списке слов.
// Урок 6, 11 ноября 2026.

// is — «является»; word — слово; Boolean — ответ да/нет (true/false)
fun isPalindrome(word: String): Boolean {
    val small = word.lowercase()               // lowercase — все буквы маленькие
    var reversed = ""                          // reversed — перевёрнутое
    for (i in small.length - 1 downTo 0) {     // downTo — вниз до
        reversed = reversed + small[i]
    }
    return small == reversed
}

fun main() {
    val words = listOf("шалаш", "кот", "Анна", "казак", "роза")   // list — список; of — из; words — слова
    println(words[0])                          // элемент номер 0: шалаш
    println(words.size)                        // size — размер: 5 элементов
    println(words[words.size - 1])             // последний: роза

    var count = 0                              // count — счёт; счётчик, пока 0
    for (w in words) {                         // w — одно слово; in — в, из
        if (isPalindrome(w)) {                 // w без кавычек — коробка, "w" — буква w
            count = count + 1                  // нашли палиндром → +1
            println("$count: Нашли палиндром $w")
        }
    }
    println("Палиндромов: $count")             // после цикла, один раз
}

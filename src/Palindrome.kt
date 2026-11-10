// Палиндром — слово, которое одинаково читается слева направо и справа налево: шалаш, казак, потоп.
// Урок 5, 9 ноября 2026. Ловушку «Анна» починил 10 ноября через lowercase().

// is — «является»; word — слово; Boolean — ответ да/нет (true/false)
fun isPalindrome(word: String): Boolean {
    val small = word.lowercase()               // small — маленький; lowercase — все буквы маленькие (lower — нижний, case — регистр)
    var reversed = ""                          // reversed — перевёрнутое; "" — пустая строка
    for (i in small.length - 1 downTo 0) {     // length — длина; downTo — вниз до
        reversed = reversed + small[i]         // приклеиваем букву к копилке
    }
    return small == reversed                   // return — вернуть ответ; == — «равно?»
}

fun main() {                                   // fun = function, функция; main — главная, отсюда старт
    println(isPalindrome("шалаш"))             // true
    println(isPalindrome("азор"))              // false: задом наперёд «роза»
    println(isPalindrome("Анна"))              // true: lowercase сделал «анна», ловушка обезврежена
}

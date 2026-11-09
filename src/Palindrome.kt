// Палиндром — слово, которое одинаково читается слева направо и справа налево: шалаш, казак, потоп.
// Урок 5, 9 ноября 2026.

// is — «является»; word — слово; Boolean — ответ да/нет (true/false)
fun isPalindrome(word: String): Boolean {
    var reversed = ""                          // reversed — перевёрнутое; "" — пустая строка
    for (i in word.length - 1 downTo 0) {      // length — длина; downTo — вниз до
        reversed = reversed + word[i]          // приклеиваем букву к копилке
    }
    return word == reversed                    // return — вернуть ответ; == — «равно?»
}

fun main() {                                   // fun = function, функция; main — главная, отсюда старт
    println(isPalindrome("шалаш"))             // true
    println(isPalindrome("азор"))              // false: задом наперёд «роза»
    println(isPalindrome("Анна"))              // false: «А» и «а» для Kotlin разные буквы
}

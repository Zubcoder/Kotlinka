// Палиндром — слово, которое одинаково читается слева направо и справа налево: шалаш, казак, потоп.
// Урок 5, 9 ноября 2026.

fun main() {                                   // fun = function, функция; main — главная
    val name = "шалаш"                         // name — имя; это String, строка
    var reversed = ""                          // reversed — перевёрнутое; "" — пустая строка

    for (i in name.length - 1 downTo 0) {      // length — длина; downTo — вниз до
        reversed = reversed + name[i]          // приклеиваем букву к копилке
    }

    if (name == reversed) {                    // == — «равно?»
        println("$name — палиндром")
    } else {
        println("$name — не палиндром")
    }
}

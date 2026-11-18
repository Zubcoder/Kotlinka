# Kotlinka

Котлинка — мой путь в Kotlin: решения задач по шагам.

Учу Kotlin с нуля, чтобы перейти в мобильную разработку. В коде оставляю комментарии с переводом английских слов.

## Решения

| Задача | Файл | Что использовано |
|---|---|---|
| Средний балл из диплома | [src/AverageGrade.kt](src/AverageGrade.kt) | `listOf`, `for`, копилка, `toDouble()`, `format` |
| Палиндром | [src/Palindrome.kt](src/Palindrome.kt) | строки, индексы, `length - 1`, `downTo`, функция `Boolean`, `return`, `lowercase()` |
| Списки: сколько палиндромов | [src/Lists.kt](src/Lists.kt) | `listOf`, `size`, `size - 1`, `for (w in words)`, счётчик `count`, `if` + своя функция |
| Изменяемые списки: собрать положительные | [src/MutableLists.kt](src/MutableLists.kt) | `mutableListOf`, `add`, `remove`, `sum()`, `max()`, `min()`, пустой список `<Int>` |
| Морозные дни (сам, без пропусков) | [src/Frost.kt](src/Frost.kt) | фильтр `n < 0`, `mutableListOf<Int>()`, `add`, `size`, `min()` |
| when: оценки, погода, цвет кодпичика | [src/When.kt](src/When.kt) | `when (x)`, `1, 2 ->`, `when` с условиями, порядок строк, `else` |
| Map: словарик и цвета кодпичиков | [src/Map.kt](src/Map.kt) | `mapOf`, `to`, поиск по ключу, `null`, `?:`, `mutableMapOf`, добавить/заменить, `in` |
| Классы и null: коты, кодпичики, уроки | [src/Classes.kt](src/Classes.kt) | `data class`, точка `.name`, список объектов, `Boolean`-свойство, `String?`/`Int?`, `?:` в `${}` |
| Лямбды: числа, коты, кодпичики, уроки | [src/Lambdas.kt](src/Lambdas.kt) | `{ }`, `it`, `n ->`, `filter`, `forEach`, `map`, `count`, `sumOf`, цепочка `filter { }.map { }`, среднее `sumOf / size` |
| Сортировка: коты и уроки | [src/Sorting.kt](src/Sorting.kt) | `sortedBy`, `sortedByDescending`, по алфавиту, цепочка `filter`→`sortedBy`→`map`, `first()`, устойчивая сортировка |
| O(n): сколько шагов | [src/BigO.kt](src/BigO.kt) | O(1), O(n), O(n²): один цикл, цикл в цикле, `first()`; лимит времени на Контесте (TL) |

## Как запустить

Скопировать код из файла в [Kotlin Playground](https://play.kotlinlang.org) и нажать ▶.

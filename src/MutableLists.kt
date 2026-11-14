// mutable — изменяемый, add — добавить, remove — убрать
// sum — сумма, max — самое большое, min — самое маленькое
// positive — положительные, nums — числа

fun main() {
    val cats = mutableListOf("Барсик", "Мурка")
    cats.add("Рыжик")              // add — добавить в конец
    cats.remove("Мурка")           // remove — убрать, Рыжик сдвигается на номер 1
    println(cats)                  // [Барсик, Рыжик]
    println(cats[1])               // Рыжик

    val scores = mutableListOf(5, 3, 4)
    scores.add(5)                  // программа идёт сверху вниз: 5 уже в списке
    println(scores.sum())          // 17
    println(scores.max())          // 5
    println(scores.min())          // 3

    val nums = listOf(5, -2, 8, -1, 7)
    val positive = mutableListOf<Int>()   // пустой список, <Int> — в нём целые числа
    for (n in nums) {
        if (n > 0) {
            positive.add(n)        // кладём само число, а не +1
        }
    }
    println(positive)                          // [5, 8, 7]
    println("Сумма: ${positive.sum()}")        // 20
    println("Максимум: ${positive.max()}")     // 8
}

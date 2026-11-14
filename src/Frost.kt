// temps (temperatures) — температуры, frost — мороз
// size — сколько элементов, min — самое маленькое

fun main() {
    val temps = listOf(3, -5, 0, -12, 7, -1, 2)
    val frost = mutableListOf<Int>()     // пустой список морозных дней
    for (n in temps) {
        if (n < 0) {                     // ноль — не мороз
            frost.add(n)
        }
    }
    println(frost)                                   // [-5, -12, -1]
    println("Морозных дней: ${frost.size}")          // 3
    println("Самый холодный: ${frost.min()}")        // -12
}

// Мини-проект «AI Фармацевт» в консоли
// medicine — лекарство, kit — аптечка, count — количество, unit — единица измерения
// expiryMonth / expiryYear — месяц / год окончания срока годности
// title — заголовок, now — сейчас, expired — просроченные
// limits — лимиты, plan — тариф, used — использовано, repeat — повтори

data class Medicine(val name: String, val count: Int, val expiryMonth: Int, val expiryYear: Int, val unit: String)

fun showKit(kit: List<Medicine>, title: String) {
    println(title)
    kit.forEach { med ->         // med — лекарство
        println("Лекарство: ${med.name} ${med.count} ${med.unit} Годен до ${med.expiryMonth}.${med.expiryYear}")
    }
}

// dateNum — дата одним числом: год * 12 + месяц, чтобы сравнивать сроки
fun dateNum(med: Medicine): Int {
    return med.expiryYear * 12 + med.expiryMonth
}

fun main() {
    val kit = mutableListOf(
        Medicine("Парацетамол", 2, 10, 2027, "уп."),
        Medicine("Йод", 1, 12, 2025, "фл."),
        Medicine("Терафлю", 6, 9, 2026, "пак."),
        Medicine("Пластырь", 10, 7, 2027, "шт.")
    )

    println(kit.size)
    println(kit.first().name)
    showKit(kit, "💊 Аптечка:")

    val now = 2026 * 12 + 11     // now — сейчас, ноябрь 2026
    val expired = kit.filter { dateNum(it) < now }
    println("⚠️ Просрочено: ${expired.map { it.name }}")

    showKit(kit.sortedBy { dateNum(it) }, "📅 По сроку годности:")

    kit.add(Medicine("Нурофен", 1, 3, 2028, "бл."))     // add — добавить
    kit.removeAll { dateNum(it) < now }                 // removeAll — удалить все, которые…
    showKit(kit, "🗑 После уборки:")

    val limits = mapOf("Free" to 3, "PRO" to 50)
    val plan = "Free"
    val limit = limits[plan] ?: 0
    var used = 0

    repeat(4) {
        if (used < limit) {
            used++
            println("📷 Скан $used из $limit")
        } else {
            println("⛔ Лимит исчерпан. Купите PRO")
        }
    }
}

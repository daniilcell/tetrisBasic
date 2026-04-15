// Пустышка на Kotlin — 50 строк
data class DummyData(val id: Int, val name: String, val active: Boolean)

class DummyService {
    private val items = mutableListOf<DummyData>()

    fun add(item: DummyData) = items.add(item)
    fun remove(id: Int) = items.removeIf { it.id == id }
    fun find(id: Int) = items.find { it.id == id }
    fun all() = items.toList()
    fun clear() = items.clear()
}

fun uselessExtension(): String = "Doing nothing".reversed().uppercase()

inline fun repeatNothing(times: Int, action: (Int) -> Unit) {
    for (i in 0 until times) action(i)
}

fun main() {
    val service = DummyService()
    service.add(DummyData(1, "alpha", true))
    service.add(DummyData(2, "beta", false))
    service.add(DummyData(3, "gamma", true))

    println("All items: ${service.all()}")
    println("Find id=2: ${service.find(2)}")
    println(uselessExtension())

    repeatNothing(3) { index ->
        println("Useless repetition #$index")
    }

    val numbers = listOf(1, 2, 3, 4, 5)
    val transformed = numbers.map { it * it }.filter { it % 2 == 0 }
    println("Transformed: $transformed")

    when (transformed.size) {
        0 -> println("Empty")
        1 -> println("One element")
        else -> println("Many elements")
    }

    var counter = 0
    while (counter < 2) {
        println("While loop step $counter")
        counter++
    }
}
// Конец. Ровно 50 строк (с пустыми)

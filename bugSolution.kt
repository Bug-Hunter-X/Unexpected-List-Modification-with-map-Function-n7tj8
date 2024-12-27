fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // This correctly prints the doubled list
    println(list) // This prints the original list, unmodified
}
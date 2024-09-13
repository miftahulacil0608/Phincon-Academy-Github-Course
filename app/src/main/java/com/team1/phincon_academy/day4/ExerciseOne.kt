fun main() {
    /*//List
    val listDayOfWeek =
        mutableListOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println(listDayOfWeek)
    listDayOfWeek[6] = "Holiday"
    println(listDayOfWeek)
    listDayOfWeek.remove("Monday")
    println(listDayOfWeek)

    //Set
    val setOfNumber = mutableSetOf<Int>(1, 2, 3, 4, 5)
    println(setOfNumber)
    setOfNumber.add(3)
    setOfNumber.add(6)
    setOfNumber.addAll(setOf(7, 8))
    println(setOfNumber)
    setOfNumber.remove(1)
    println(setOfNumber)
    println("Nomor 1 ada di dalam setnya? ${setOfNumber.contains(1)}")
*/

    /*//Map
    val mapOfFruit = mutableMapOf<String, Int>(
        "Pisang" to 5_000,
        "Alpukat" to 30_000,
        "Jeruk" to 8_000
    )
    println(mapOfFruit)
    mapOfFruit.putAll(mapOf(
        "Sawo" to 8_000,
        "Apel" to 20_000
    ))
    println(mapOfFruit)
    println("Harga Apel = ${mapOfFruit["Apel"]}")
    mapOfFruit["Pisang"] = 10_000
    println(mapOfFruit)
    mapOfFruit.remove("Jeruk")
    println(mapOfFruit)
*/

    //Sequence

    /*val sequenceWithFilter = (0..10).asSequence().filter {
        it % 2 == 1
    }
    sequenceWithFilter.forEach {
        println(it)
    }

    val sequenceGanjil = generateSequence(seed = 5) { it + 2 }
    sequenceGanjil.take(3).forEach {
        println(it)
    }
*/
    val fibonacciSequence = generateSequence(0 to 1) {
        it.second to it.first + it.second
    }

    fibonacciSequence.take(5).forEach {
        println(it)
    }


}


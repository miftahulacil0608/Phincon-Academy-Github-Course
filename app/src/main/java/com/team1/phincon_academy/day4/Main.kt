

fun main() {
    //list
    println("---List Of---")
    val listNim = listOf("2020103", "2020104", "2120105")
    println(listNim)
    println(listNim.filter {
        it.startsWith("20")
    })

    println("Mutable List Of")
    val listName = mutableListOf<String>("Azisz", "Dinda", "Miftahul")
    println(listName)
    listName.add("Sumarti")
    println(listName)
    listName.removeAt(2)
    println(listName)

    //set
    println("---Set Of---")

    val setNik = setOf("90238490283", "20893428443", "2093482432", "20893428443")
    println(setNik)

    println("Mutable Set Of")

    val setResidence = mutableSetOf("Ibu Budi", "Bapak Budi", "Anak Budi")
    println(setResidence)
    setResidence.add("Anak Budi")
    println(setResidence.contains("Anak Budi"))

    //map
    println("Map Of")
    val mapResidence = mapOf("32167" to "Azisz", "321890" to "Dinda", "321790" to "Miftahul")
    println(mapResidence)
    mapResidence.getValue("321790")

    println("Mutable Map Of")
    val mapContact = mutableMapOf("085232" to "Azisz", "087744" to "Sumarti", "086521" to "Dinda")
    println(mapContact)
    mapContact["098123"] = "Ahmad"
    println(mapContact)
    mapContact.remove("087744")
    println(mapContact)

    //Sequences
    val sequences = (1..10).asSequence()
    sequences.forEach { println(it) }

    val generateSequences = generateSequence(2){it+2}
    generateSequences.take(5).forEach {
        println(it)
    }


}


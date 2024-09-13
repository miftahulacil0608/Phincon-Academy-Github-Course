import Result

fun main() {

    val listIntExample = listOf<Int>(2, 3, 5, 6, 7, 9, 8)

    shortingListAndFilteringInt(listOf(2, 4, 5, 3, 1))
    shortingListAndFilteringString(listOf("Ahmad", "Dinda", "Azisz", "Miftahul", "Sumarti"))

    //using for
    println("\n=== For ===")
    for (i in listIntExample) {
        print("$i, ")
    }
    //using foreach
    println("\n=== Foreach ===")
    listIntExample.forEach {
        print("$it, ")
    }
    //using for with index
    println("\n=== For with index ===")
    for ((index, value) in listIntExample.withIndex()) {
        println("Nilai nya $value berada pada index ke-$index")
    }


    //latihan list
    println("\n===Latihan List===")
    val bilanganBulat = (1..20).filter { it % 2 == 0 }
    println(bilanganBulat)
    val bilanganBaru = bilanganBulat.map { it * 2 }
    println(bilanganBaru)

    //Latihan list 2
    println("\n===Latihan List2===")
    /*val listOfAnimal = listOf("Kucing","Anjing","Burung","Ayam")
    println(listOfAnimal.filter { it.startsWith("A") })

    val animalX = listOfAnimal.filter { it.startsWith("X") }
    if (animalX.isNullOrEmpty()){
        println("Tidak ada hewan dengan awal x")
    }else{
        println(animalX)
    }*/

    val searchAnimal = searchAnimal("A", listOf("Kucing", "Anjing", "Burung", "Ayam"))
    println(searchAnimal)

    //Latihan list 3
    println("\n===Latihan List3===")
    val listPerson = listOf(
        Person("Ahmad", age = 24, address = "Jakarta"),
        Person("Miftahul", age = 23, address = "Nganjuk"),
        Person("Azisz", age = 22, address = "Bogor"),
        Person("Ahmadi", age = 25, address = "Bekasi"),
    )

    println(listPerson)

    /*val sortingFromTuaKeMuda = listPerson.map {
        it
    }.sortedByDescending {
        it.age
    }
    println("===urutin dari tua ke muda===")
    sortingFromTuaKeMuda.forEach {
        println(
            it.name
        )
    }

    println("===3orang termuda===")
    val termuda = listPerson.map {
        it
    }.sortedBy {
        it.age
    }

    termuda.take(3).forEach {
        println(it.name)
    }*/
    println(ageDescending(listPerson))
    println(ageAscending(listPerson))

    //Latihan list 3
    println("\n===Latihan List 4===")
    val listOfProduct = listOf<Product>(
        Product(name = "Celana Jeans", price = 150_000, category = "Pakaian"),
        Product(name = "Beras", price = 17_000, category = "Makanan"),
        Product(name = "Beras Merah", price = 20_000, category = "Makanan"),
        Product(name = "Kemeja", price = 100_000, category = "Pakaian"),
        Product(name = "Sepatu", price = 1_700_000, category = "Pakaian"),
        Product(name = "MacBook", price = 17_000_000, category = "Elektronik"),
        Product(name = "ChromeBook", price = 8_000_000, category = "Elektronik"),
        Product(name = "Samsung Galaxy 200", price = 29_000_000, category = "Elektronik"),
        Product(name = "Pixel 15", price = 25_000_000, category = "Elektronik"),
        Product(name = "Google 18", price = 23_000_000, category = "Elektronik"),
        Product(name = "AlienWare 18", price = 230_000_000, category = "Elektronik"),

        )
    val productElektronik = listOfProduct.filter {
        it.category == "Elektronik"
    }
    println("Filter produk elektronik = $productElektronik")

    val priceLowToHigh = productElektronik.sortedBy {
        it.price
    }

    println("Harga termurah ke termahal = $priceLowToHigh")

    val onlyFiveProduct = priceLowToHigh.take(5)

    println("5 produk sesui harga termahal terakhir = $onlyFiveProduct")

    val newListOfProduct = onlyFiveProduct.map {
        //data class yang berbeda
        Result(it.name,it.price)

        //cara 2
        //it.name to it.price

        //cara 3
        //Pair(it.name,it.price)
    }
    println(newListOfProduct)

    //or gunakan cara berikut
    val resultIn1Line = listOfProduct.filter {
        it.category == "Elektronik"
    }.sortedBy {
        it.price
    }.take(5).map {
        Pair(it.name,it.price)
    }

    println(resultIn1Line)


}




fun ageDescending(listPerson:List<Person>):List<String>{
    return listPerson.sortedByDescending {
        it.age
    }.map {
        it.name
    }
}

fun ageAscending(listPerson: List<Person>):List<String>{
    return listPerson.sortedBy {
        it.age
    }.take(3).map {
        it.name
    }
}



fun searchAnimal(s: String, data: List<String>): String {
    val search = data.filter { it.startsWith(s) }
    return if (search.isEmpty()) "Tidak ada nama hewan dengan awalan $s" else "Hewan $search tersedia"
}


fun shortingListAndFilteringInt(listInput: List<Int>) {
    println("Value = $listInput")
    val shortingAscending = listInput.sorted()
    println("shorting ascending = $shortingAscending")
    val shortingDescending = listInput.sortedDescending()
    println("shorting descending = $shortingDescending")

    val filtering = shortingAscending.filter {
        it % 2 == 1
    }
    println(filtering)
}

fun shortingListAndFilteringString(listInput: List<String>) {
    val keluargaA = listInput.filter { it.startsWith("A") }
    println(keluargaA)

    val championA = keluargaA.filter { it.length > 4 }

    championA.forEach {
        println(it)
    }

}


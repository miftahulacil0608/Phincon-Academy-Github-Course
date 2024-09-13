fun main() {
    // fungsi biasa
    println(luasPersegiPanjang(20, 20))

    //fungsi anonymous / lambda expression
    val luas = { panjang: Int, lebar: Int -> panjang * lebar }(5, 3)

    val exampleHOF = exampleHOF(mutableListOf(5, 7, 8))
    exampleHOF

    //quiz 1
    val calculateDiscount = calculateDiscount(totalPrice = 150_000.00)
    println(calculateDiscount)

    //digunakan untuk int, karena int tidak bisa membaca tanda baca yang terlalu spesifik
    val hasil = 150_000 - (150_000 * 20 / 100)
    println(hasil)
}

fun luasPersegiPanjang(panjang: Int, lebar: Int): Int {
    return panjang * lebar
}

fun exampleHOF(numbers: MutableList<Int>) {
    numbers.add(100)
    val sortedData = numbers.sortedBy { it }
    val filterData = sortedData.filter { it % 2 == 0 }

    sortedData.forEach {
        print("$it ")
    }

    println()
    println("Data yang telah di filter = $filterData")
}


//quiz 1
fun calculateDiscount(totalPrice: Double): String {

    val calculate = when {
        totalPrice < 50000 -> totalPrice - totalPrice * 0
        totalPrice in 50000.0..100000.0 -> totalPrice - (totalPrice * (10.0 / 100.0))
        else -> totalPrice - (totalPrice * (20.0 / 100.0))
    }

    return "harga awal Rp. ${totalPrice.toInt()}, diskon Rp. ${calculate.toInt()}"
}
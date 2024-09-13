fun main() {
    val oyen = Kucing("Oyen")
    oyen.makanan()
    println(oyen.minum("Air Surga"))

}

abstract class Animal(val name: String) {
    abstract fun makanan()
    open fun minum(minuman: String): String {
        return "$name biasanya minum $minuman"
    }
}

class Kucing(val namaHewan: String) : Animal(namaHewan) {
    override fun makanan() {
        println("$namaHewan biaasanya makan wiskas")
    }

    override fun minum(minuman: String): String {
        return super.minum(minuman)
    }

}

interface Menggambar {
    fun gambar()

    fun hapus()
    
    fun lemparGambar():String{
        return "Gambar dilempar"
    }

}

class Pegunungan() : Menggambar {
    override fun gambar() {
        TODO("Not yet implemented")
    }

    override fun hapus() {
        TODO("Not yet implemented")
    }

}


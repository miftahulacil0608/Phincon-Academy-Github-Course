fun main() {

    val persegi = Persegi(5.0)
    println("Luas Persegi = ${persegi.hitungLuas()}")
    println("Keliling Persegi = ${persegi.hitungKeliling()}")

    val lingkaran = Lingkaran(10.0)
    println("Luas Lingkaran ${lingkaran.hitungLuas()}")
    println("Keliling Lingkaran ${lingkaran.hitungKeliling()}")

    val segitiga = Segitiga(alas = 5.0, tinggi = 5.0, b = 10.0)
    println("Luas Segitiga = ${segitiga.hitungLuas()}")
    println("Keliling Segitiga =  ${segitiga.hitungKeliling()}")
}

open class BentukGeometri {
    open fun hitungLuas() = 0.0

    open fun hitungKeliling() = 0.0
}

class Persegi(private val sisi: Double) : BentukGeometri() {
    override fun hitungLuas() = sisi * sisi
    override fun hitungKeliling() = sisi + sisi + sisi + sisi
}

class Lingkaran(private val jariJari: Double) : BentukGeometri() {
    override fun hitungLuas() = Math.PI * jariJari * jariJari
    override fun hitungKeliling() = 2 * Math.PI * jariJari
}

class Segitiga(private val alas: Double, private val tinggi: Double, private val b: Double) : BentukGeometri() {
    override fun hitungLuas() = 0.5 * alas * tinggi
    override fun hitungKeliling(): Double = (alas + b + tinggi)

}

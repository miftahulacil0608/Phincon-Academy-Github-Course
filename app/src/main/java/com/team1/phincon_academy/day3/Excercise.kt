fun main() {
    val karyawan = Karyawan("Azisz", "2020103", 5000.0)
    println(karyawan.getInformation())
    karyawan.naikkanGaji(4000.0)
    println(karyawan.getInformation())
    karyawan.naikkanGaji(4000.0)
    println(karyawan.getInformation())
}

class Karyawan(private val name: String, private val id: String, gaji: Double) {
    private var _gaji = gaji

    fun getInformation(): String {
        return "$name and $id $_gaji"
    }

    fun naikkanGaji(inputGaji: Double) {
        _gaji += inputGaji
    }


    /*private var name: String = ""
    private var _id: String = ""
    val id: String = _id
    fun getName(): String {
        return name
    }

    fun setName(inputName: String) {
        name = inputName
    }

    fun setId(inputId: String) {
        _id = inputId
    }*/

}
import java.lang.IllegalArgumentException
import java.time.LocalDateTime

fun main() {
    val localDateTime = LocalDateTime.now().dayOfWeek.name
    val dayOfWeek = try {
        DayWeek.valueOf(localDateTime)
    } catch (e: IllegalArgumentException) {
        null
    }
    val result = when (dayOfWeek) {
        DayWeek.MONDAY -> "Masuk Kerja"
        DayWeek.TUESDAY -> "Masuk Kerja"
        DayWeek.WEDNESDAY -> "Masuk Kerja"
        DayWeek.THURSDAY -> "Masuk Kerja"
        DayWeek.FRIDAY -> "Masuk Kerja"
        DayWeek.SATURDAY -> "Weekend"
        DayWeek.SUNDAY -> "Weekend"
        else -> "Tak de tu hari"
    }
    //println("Hasilnya = $result")


    //Data Class
    /*val mahasiswaA = Mahasiswa(name = "Dinda", nim = "2020103")
    println(mahasiswaA)
    println(mahasiswaA.name)
    mahasiswaA.name = "Sumarti"
    println(mahasiswaA)*/


    //object

    //initial state
    ConfigApp.getConfigApp("Awal")

    //edit state
    ConfigApp.editConfigBahasa("Inggris")
    ConfigApp.editConfigEnv("Production")
    ConfigApp.editConfigTema("Light")

    //result state
    ConfigApp.getConfigApp("Result")

}

data class Mahasiswa(var name: String, val nim: String, val jurusan: String?=null)

enum class DayWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
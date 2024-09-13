fun main() {
    val name = "Azisz"
    println(gradingValue(name, 80, 80, ipa = 85))
}

fun gradingValue(name: String, math: Int, bing: Int, ipa: Int = 0, ips: Int = 0): String {
    val penjurusan:String
    val nilaiAwal:Int

    if (ipa!=0){
        penjurusan = "IPA"
        nilaiAwal = ipa
    }else{
        penjurusan = "IPS"
        nilaiAwal = ipa
    }
//    val jurusan = if (ipa != 0) "IPA" else "IPS"

    val average = if (penjurusan == "IPA") {
        (math + bing + ipa) / 3
    } else {
        (math + bing + ips) / 3
    }

    val grade = when {
        average > 100 -> {
            return "Nama $name nilainya tidak masuk akal!"
        }

        average >= 90 && penjurusan == "IPA" -> {
            "A"
        }

        average >= 85 && penjurusan == "IPS" -> {
            "A"
        }

        average >= 80 && penjurusan == "IPA" -> {
            "B"
        }

        average >= 75 && penjurusan == "IPS" -> {
            "B"
        }

        average >= 70 && penjurusan == "IPA" -> {
            "C"
        }

        average >= 65 && penjurusan == "IPS" -> {
            "C"
        }

        else -> {
            "D"
        }
    }

    return "nama $name dengan jurusan $penjurusan , nilai MTK $math, nilai bing $bing,nilai $penjurusan $nilaiAwal Rata-ratanya $average, dengan grade $grade"
}


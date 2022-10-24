package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namadepan: String = "Zainul"
    val namabelakang: String = "Muhajir"
    val umur: Number = 20
    val single: Boolean = true
    val tidak :Boolean = false

    println("Nama depan:$namadepan")
    println("Nama belakang:$namabelakang")
    println("Umur: $umur")
    println("Single = true, Tidak = false ")
    println("Status ( single / tidak ) :$single")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {

    println("$groupId:7")
    println("$groupMember:zainul," +
            "lumban," +
            "siti," +
            "mona," +
            "thomi")
    println("$session:afternoon")
    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val anggota: String = ("Zainul,Lumban,Siti,Mona,Thomi")
    println("anggota: $anggota" )
    return "Zainul"
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5

    return mentor.count()  +countOfGroup

}

fun main() {


    println("==========Output Exercise 1===========")
    println()
    println("==========Latihan 1===========")
    myProfile()
    println()
    println("==========Latihan 3===========")

    val myName = myName()
    println("My Name is: $myName")

    println()
    println("==========Latihan 4===========")
    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    println()
    println("==========Latihan 2dan5 ===========")
    groupDetail(1, listOf("Anggota 1", "Anggota 2", "..."), "Morning")

}
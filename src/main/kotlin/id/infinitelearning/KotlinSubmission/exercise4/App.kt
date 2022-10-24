package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    println("==========Output Exercise 4===========")
    val pin = "test"
    try {
        if (pin.length == 6) {
            println("Anda berhasil masuk!")
        } else {
            invalid("Pin salah kurang dari 6")
        }
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
    finally {
         println("Finish")
    }

    }

// exception dengan fungsi "invalid"
fun invalid(message: String): Nothing {
    throw Exception(message)
}
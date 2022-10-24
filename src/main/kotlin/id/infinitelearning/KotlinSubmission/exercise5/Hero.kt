package id.infinitelearning.KotlinSubmission.exercise5

class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 10

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan() {
        checkHealth()
        println("$name sedang berjalan...")
        health -= 1
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
    - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
    - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
    - ubah nilai variable health sesuai kegiatan yang dilakukan:
     * lari = -2
     * makan = +2
     * minum = +2
     * lompat = -2
     * duduk = +1

    Contoh fungsi bisa mengikuti fungsi jalan() diatas.

     */
    fun jalanlagi() {
        checkHealth()
        println("$name sedang berjalan...")
        health -= 1
    }
        fun Lari() {
            checkHealth()
            println("$name sedang lari...")
            health -= -2
        }
            fun Makan() {
                checkHealth()
                println("$name sedang makan...")
                health -= +2
            }
                fun Minum() {
                    checkHealth()
                    println("$name sedang minum...")
                    health -= +2
                }
                    fun Lompat() {
                        checkHealth()
                        println("$name sedang lompat...")
                        health -= -2
                    }
                        fun Duduk() {
                            checkHealth()
                            println("$name sedang duduk...")
                            health -= +1
                        }
                    }

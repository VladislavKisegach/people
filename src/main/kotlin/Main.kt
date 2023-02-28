fun main(args: Array<String>) {
   val likes = 311
   val peaple1 = "людям"
    val peaple2 = " человеку"
    val endSymbol = likes -1
    val endles = if(likes%10 == 0) println("$likes $peaple2") else if(endSymbol%10 == 0) println("$likes $peaple1") else println("$likes $peaple2")

    println(endles)
}


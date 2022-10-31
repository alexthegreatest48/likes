fun main() {
    val likes = 35

    if (likes%10 == 1){
        println("Человеку")
    } else if (likes%10 == 2 || likes%10 == 3 || likes%10 == 4){
        println("Человекам")
    } else {
        println("Людям")
    }
}
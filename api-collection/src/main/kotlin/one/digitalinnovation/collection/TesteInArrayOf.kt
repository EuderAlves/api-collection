package one.digitalinnovation.collection


fun main() {

    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }
    println("___________________")
    values.sort()
    values.forEach {
        println(it)

    }

}
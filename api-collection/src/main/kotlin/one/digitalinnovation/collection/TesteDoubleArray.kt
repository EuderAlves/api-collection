package one.digitalinnovation.collection

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    for (valor in salarios){
        println(valor)
    }
    println("_________")
    salarios.forEach { println(it) }

    println("_________")
    salarios.forEachIndexed { index, salario ->
    salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("_________")

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }


}
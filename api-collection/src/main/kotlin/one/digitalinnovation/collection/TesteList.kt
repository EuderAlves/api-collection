package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("Joao",2000.0, "CLT")
    val pedro = Funcionario("Pedro",1500.0,  "PJ")
    val maria = Funcionario("Maria",4000.0,  "CLT")


    val funcionario = listOf(joao, pedro, maria)

    funcionario.forEach { println(it) }

    println("_______________")
    println(funcionario.find { it.nome == "Maria" })

    println("_______________")
    funcionario
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("_______________")
    funcionario
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}





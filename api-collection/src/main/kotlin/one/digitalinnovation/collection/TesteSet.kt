package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionario1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach{ println(it)}

    println("_______________")
    val funcionario3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionario3.subtract(funcionario2)

    resultSubtract.forEach{ println(it)}

    println("_______________")
    val resultIntersect = funcionario3.intersect(funcionario2)

    resultIntersect.forEach{ println(it)}


}
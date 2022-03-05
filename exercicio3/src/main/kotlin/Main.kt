fun main(args: Array<String>) {
    crime()
}

fun crime(): Unit {

    println("Telefonou para a vítima? \n1-Sim ou 0-Não ")
    val pergunta1 = readLine()!!.toInt()

    println("Esteve no local do crime? \n1-Sim ou 0-Não ")
    val pergunta2 = readLine()!!.toInt()

    println("Mora perto da vítima? \n1-Sim ou 0-Não ")
    val pergunta3 = readLine()!!.toInt()

    println("Devia para a vítima? \n1-Sim ou 0-Não ")
    val pergunta4 = readLine()!!.toInt()

    println("Já trabalhou com a vítima? \n1-Sim ou 0-Não ")
    val pergunta5 = readLine()!!.toInt()

    var somaPerguntas = pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5

    if (somaPerguntas < 2) {
        println("\nInocente")
    } else if (somaPerguntas == 2) {
        println("\nSuspeito")
    } else if (somaPerguntas <= 4 || somaPerguntas <= 3) {
        println("\nCúmplice")
    } else if (somaPerguntas == 5) {
        println("\nAssassino")
    }
}
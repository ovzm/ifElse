fun main(args: Array<String>) {

    Combustiveis()
}

fun Combustiveis() {
    // preço combustiveis
    var precoA = 3
    var precoG = 4

    println("Quantos litros você deseja: ")
    var litros = readLine()!!.toFloat()

    println("Qual combustível deseja comprar: \nA - Álcool \nG - Gasolina")
    var combustivel = readLine()!!

    if (combustivel.equals("A", true)) println("Opção escolhida: Álcool (A)")
    else if (litros <= 20) {
        println("Você tem 3% de desconto, Seu valor a pagar é: " + litros * (precoA * (1 - (3 / 100))))
    }
    else if (litros > 20) {
        println("Você tem 5% de desconto, Seu valor a pagar é: " + litros * (precoA * (1 - (5 / 100))))
    }

    if (combustivel.equals("G", true)) println("Opção escolhida: Gasolina (G)")
    else if (litros <= 20) {
        println("Você tem 4% de desconto, Seu valor a pagar é: " + litros * (precoG * (1 - (4 / 100))))
    }
    else if (litros > 20) {
        println("Você tem 6% de desconto, Seu valor a pagar é: " + litros * (precoG * (1 - (6 / 100))))
    }
}
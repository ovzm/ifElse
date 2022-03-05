fun main(args: Array<String>) {
    triangulo()
}

fun triangulo(): Unit {

    println("Entre com a medida do lado 1 do triangulo: ")
    val lado1 = readLine()!!.toInt()

    println("Entre com a medida do lado 2 do triangulo: ")
    val lado2 = readLine()!!.toInt()

    println("Entre com a medida do lado 3 do triangulo: ")
    val lado3 = readLine()!!.toInt()

    val resultado = TrianguloCalc(lado1, lado2, lado3)
    println(resultado.verificarCalculo())
}
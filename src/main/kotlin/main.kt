fun main() {
    println("Bem vindo ao Bytebank")

    val titular = "Alexandre"
    println("titular $titular")

    val numeroConta = 4040
    var saldoConta = 0.0
//    saldoConta += 200
//    saldoConta -= 1000

    println("numero da conta $numeroConta")
    println("saldo da conta $saldoConta")

    if (saldoConta > 0.0) {
        println("conta eh positiva")
    } else if (saldoConta == 0.0) {
        println("conta eh neutra")
    } else {
        println("conta eh negativa")
    }

    when {
        saldoConta > 0.0 -> println("conta eh positiva")
        saldoConta == 0.0 -> println("conta eh neutra")
        saldoConta < 0.0 -> println("conta eh negativa")
    }

}
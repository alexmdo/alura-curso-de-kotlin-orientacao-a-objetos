fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlexandre = Conta()
    contaAlexandre.titular = "Alexandre"
    contaAlexandre.numero = 4140
    contaAlexandre.saldo = 100.0
    println(contaAlexandre)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 4840
    contaFran.saldo = 300.0
    println(contaFran)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }


}

private fun testaLacos() {
    /*for (i in 5 downTo 1 step 2) {
        val titular = "Alexandre $i"
        println("titular $titular")

        val numeroConta = 4040 + i
        var saldoConta = 10.0 + i

        println("numero da conta $numeroConta")
        println("saldo da conta $saldoConta")
        println()
    }*/

    var i = 1
    while (i <= 5) {
        val titular = "Alexandre $i"
        println("titular $titular")

        val numeroConta = 4040 + i
        var saldoConta = 10.0 + i

        println("numero da conta $numeroConta")
        println("saldo da conta $saldoConta")
        println()
        i++
    }
}

private fun testaCondicoes(saldoConta: Double) {
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
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
    contaFran.saldo = 200.0
    println(contaFran)

    contaAlexandre.depositar(50.0)
    println(contaAlexandre)

    contaAlexandre.sacar(20.0)
    println(contaAlexandre)

    contaAlexandre.sacar(140.0)
    println(contaAlexandre)

    if (contaAlexandre.transferir(100.0, contaFran)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaAlexandre)
    println(contaFran)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun depositar(valor: Double) {
        println("depositando na conta do ${this.titular}")
        this.saldo += valor
    }

    fun sacar(valor: Double) {
        println("sacando da conta do ${this.titular}")
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transferir(valor: Double, contaDestino: Conta): Boolean {
        println("transferencia de $valor da conta do $titular para conta ${contaDestino.titular}")
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.saldo += valor
            return true
        }

        return false
    }

    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }
}

private fun testaCopiasEReferencias() {
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

    /*val conta1 = 1010
    var conta2 = conta1
    conta2++*/

    val conta1 = Conta()
    conta1.titular = "Isabella"
    val conta2 = Conta()
    conta2.titular = "Stephanie"
    println(conta1.titular)
    println(conta2.titular)
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
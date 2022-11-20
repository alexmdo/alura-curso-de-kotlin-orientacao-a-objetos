fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlexandre = Conta("Alexandre", 4140)
    contaAlexandre.depositar(100.0)
    println(contaAlexandre)

    val contaFran = Conta("Fran", 4840)
    contaFran.depositar(200.0)
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
    private var titular = ""
    private var numero = 0
    private var saldo = 0.0

    constructor(titular: String, numero: Int) {
        this.titular = titular
        this.numero = numero
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            println("depositando na conta do ${this.titular}")
            this.saldo += valor
        }
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
            contaDestino.depositar(valor)
            return true
        }

        return false
    }

    fun getSaldo(): Double {
        return saldo
    }

    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }
}

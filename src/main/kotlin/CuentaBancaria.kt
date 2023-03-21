class CuentaBancaria(titular: String, contrasenha: String) {
    var titular = titular
    var saldo = 0
    var contrasenha = contrasenha

    fun depositar(catidad: Int) {
        this.saldo = catidad
    }

    fun validarSaldo(cantidad: Int): Boolean {
        if (cantidad > this.saldo) {
            return false
        }
        return true
    }

    fun retirar(cantidad: Int) {
        if (validarSaldo(cantidad)) {
            println("Saldo insuficiente")
        } else {
            this.saldo -= cantidad
            println("Retiro de $cantidad Bs. retirado con exito: salto Actual = ${this.saldo}")
        }
    }

    fun verSaldo() {
        println("el saldo actual es: ${this.saldo}")
    }

}

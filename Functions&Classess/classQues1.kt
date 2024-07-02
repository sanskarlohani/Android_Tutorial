fun main() {
    class BankAccount(val accountNumber: String, var bal: Double) {
   fun deposit(amt: Double) {
        if (amt > 0) {
            bal += amt
        }
    }
    fun withdraw(amt: Double) {
        if (amt > 0 && amt <= bal) {
            bal -= amt
        }
    }
    fun checkBal(): Double {
        return bal
    }
}
fun main() {
    val account = BankAccount("MNOP012345678", 20000.0)
    account.withdraw(5000.0)
    account.deposit(7000.0)
    println("Account number: ${account.accountNumber}, Bal: ${account.checkBal()}")
}
}

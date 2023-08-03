package arrayAndDynamicArrays.richestCustomerWealth

class MaximusArraySum {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        return accounts.maxOfOrNull { it.sum() } ?: 0
    }
}
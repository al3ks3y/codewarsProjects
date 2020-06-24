package kyu_7th

class ATM {
    companion object {
        fun count(number: Int): Int {
            var mutableNum = number
            if (mutableNum % 10 != 0) return -1
            val arr = intArrayOf(500, 200, 100, 50, 20, 10)
            var count = 0
            arr.forEach { a ->
                if (mutableNum >= a) {
                    count += mutableNum / a
                    mutableNum -= a * (mutableNum / a)
                }
            }
            return count
        }

        @JvmStatic
        fun main(agrs: Array<String>) {
            count(770)
        }
    }
}
/*
There is enough money available on ATM in nominal value 10, 20, 50, 100, 200 and 500 dollars.

You are given money in nominal value of n with 1<=n<=1500.

Try to find minimal number of notes that must be used to repay in dollars, or output -1 if it is impossible.

Good Luck!!!
 */
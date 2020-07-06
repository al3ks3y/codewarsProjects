package kyu_6th

import java.math.BigDecimal

class `1ncycle` {
    companion object {
        fun cycle(n: Int): Int {
            if (n % 2 == 0 || n % 5 == 0) {
                return -1
            } else {
                var c = 1
                var result = 10 % n
                while (result % n != 1) {
                    result = result * 10 % n
                    c++
                }
                return c
            }
        }

        @JvmStatic
        fun main(args: Array<String>) {
            println(cycle(18812))
        }
    }
}
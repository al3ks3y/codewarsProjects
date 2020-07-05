package kyu_6th

import java.math.BigDecimal

class `1ncycle` {
    companion object {
        fun cycle(n: Int): Int {
            val devided: String = BigDecimal.valueOf(1.0 / n).toString()
            val charArray = devided.toCharArray().toMutableList()
            repeat(2) { charArray.removeAt(0) }

            for ((i, c) in charArray.withIndex()) {
                if (i >= 2 && 2 * i - 2 < charArray.size &&
                    !devided.substring(2, i).equals("") &&
                    !devided.substring(2, i).equals("0") &&
                    devided.substring(2, i).equals(devided.substring(i, i + devided.substring(2, i).length))
                    && devided.substring(2, i).equals(
                        devided.substring(
                            i + devided.substring(2, i).length,
                            i + 2 * (devided.substring(2, i).length)
                        )
                    )
//                    && devided.substring(2, i).equals(
//                        devided.substring(
//                            devided.length - devided.substring(2, i).length - 1,
//                            devided.length - 1
//                        )
//                    )
                ) {
                    //println(devided.substring(1+n.toString().length, i))
                    return devided.substring(2, i).length
                }
            }
            return -1
        }

        @JvmStatic
        fun main(args: Array<String>) {
            println(cycle(18812))
        }
    }
}
package kyu_6th

class CountingDuplicates {
    companion object {
        fun duplicateCount(text: String): Int {
            val a = mutableMapOf<Char, Int>()
            text.toLowerCase().toCharArray().forEach { ch ->
                if (!a.keys.contains(ch)) {
                    a[ch] = 1
                } else {
                    a[ch] = a[ch]!!.plus(1)
                }
            }
            var result = 0
            a.values.removeIf { it < 2 }
            return a.values.size
        }

        @JvmStatic
        fun main(agrs: Array<String>) {
            print(duplicateCount("abcdea"))
        }
    }
}
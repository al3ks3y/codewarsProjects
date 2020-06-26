package kyu_7th

class AlternateCapitalization {
    companion object {
        fun capitalize(text: String): List<String> {
            val array = text.toCharArray()
            val var1 = mutableListOf<Char>()
            val var2 = mutableListOf<Char>()
            for (c in array.withIndex()) {
                if (c.index % 2 == 0) {
                    var1.add(c.value.toUpperCase())
                    var2.add(c.value)
                } else {
                    var1.add(c.value)
                    var2.add(c.value.toUpperCase())
                }
            }
            return listOf(String(var1.toCharArray()), String(var2.toCharArray()))
        }

        @JvmStatic
        fun main(agrs: Array<String>) {
            print(capitalize("alexey"))
        }
    }
}
package kyu_6th

class Binaries {
    companion object {
        fun code(str: String): String {
            if (!str.matches("\\d+".toRegex())) {
                return ""
            }
            val result = mutableListOf<Char>()
            str.toCharArray().forEach { digit ->
                val binary = Character.getNumericValue(digit).toString(2)
                repeat(binary.length - 1) {
                    result.add('0')
                }
                result.add('1')
                result.addAll(Character.getNumericValue(digit).toString(2).toCharArray().asList())
            }
            return result.joinToString().replace(", ", "")
        }

        fun decode(str: String): String {
            var start = 0
            val result = mutableListOf<Char>()
            while (start < str.length) {
                val i = str.indexOf("1", start)
                val number = str.substring(i + 1, 2 * i - start + 2)
                result.addAll(Integer.parseInt(number, 2).toString().toCharArray().asList())
                start = 2 * i - start + 2
            }
            return result.joinToString().replace(", ", "")
        }

        @JvmStatic
        fun main(agrs: Array<String>) {
            println(code("62"))
            println(decode("0011110011110111011100011000"))
        }
    }
}
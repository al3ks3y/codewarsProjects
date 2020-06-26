package kyu_6th


class EncryptThis {
    companion object {
        fun encryptThis(text: String): String {
            val wordArray = text.split("[,| ]".toRegex())
            val result = mutableListOf<String>()
            wordArray.forEach { word ->
                run {
                    val charArray = word.toCharArray().toMutableList()
                    if (charArray.size > 1) {
                        val lastChar = charArray[charArray.size - 1]
                        charArray[charArray.size - 1] = charArray[1]
                        charArray[1] = lastChar
                    }

                    val firstItem = charArray[0].toInt().toString()
                    charArray.removeAt(0)
                    for (char in firstItem.reversed()) {
                        charArray.add(0, char)
                    }
                    result.add(String(charArray.toCharArray()))
                }
            }
            return result.joinToString().replace(",", "")
        }

        @JvmStatic
        fun main(agrs: Array<String>) {
            print(encryptThis("A wise old owl lived in an oak"))
        }
    }

}
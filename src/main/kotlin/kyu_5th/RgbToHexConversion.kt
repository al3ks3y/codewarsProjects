package kyu_5th

//The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned.
// Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
//Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
class RgbToHexConversion {
    companion object {
        fun rgb(r: Int, g: Int, b: Int): String {
            return toHex(r) + toHex(g) + toHex(b)
        }
        fun toHex(num: Int): String {
            if (num < 0) return "00"
            if (num > 255) return "FF"
            val hex = num.toString(16)
            return if (hex.length == 1) "0$hex".toUpperCase()
            else hex.toUpperCase()
        }

        @JvmStatic
        fun main(args: Array<String>) {
            println(rgb(0, 0, 0))
        }
    }
}
package kyu_7th

class GrowingPlant {
    companion object {
        fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
            var currentHeight = 0
            var count = 1;
            while (currentHeight < desiredHeight) {
                currentHeight += upSpeed
                if (currentHeight >= desiredHeight) break
                currentHeight -= downSpeed
                count++
            }
            return count
        }

        @JvmStatic
        fun main(agrs: Array<String>) {
            print(growingPlant(100, 10, 910))
        }
    }

}
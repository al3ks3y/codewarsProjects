package kyu_7th

class Evaporator {
    companion object {
        fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
            var count = 0
            var tankContent = content
            while (tankContent > threshold * content / 100) {
                tankContent *= (100 - evap_per_day) / 100
                count++
            }
            return count
        }

        @JvmStatic
        fun main(agrs: Array<String>) {
            print(evaporator(10.0, 10.0, 10.0))
        }
    }
}
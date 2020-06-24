package kyu_6th

import kotlin.math.pow

class AreTheyTheSame {
    fun comp(a: IntArray?, b: IntArray?): Boolean {
        //your code here

        if (a == null || a.isEmpty() || b == null || b.isEmpty() || a.size != b.size) {
            return false
        }
        val map: HashMap<Int, Int?> = HashMap()
        a.forEach { num -> map[num] = null }

        a.forEach { r ->
            b.forEach { s ->
                if (r * r == s) {
                    map[r] = s
                    map[s] = r
                }
            }
        }
        return !map.values.contains(null)
    }

    fun main(args: Array<String>) {
        comp(intArrayOf(1, 1), intArrayOf(1, 1))
    }
}
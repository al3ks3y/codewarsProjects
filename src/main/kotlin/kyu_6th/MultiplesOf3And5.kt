package kyu_6th

class MultiplesOf3And5 {
        fun solution(number: Int): Int {
            val set= mutableSetOf<Int>()
            for (x in 3 until number){ if(x%3==0||x%5==0)set.add(x) }
            return set.stream().mapToInt {it!!}.sum()
        }

}
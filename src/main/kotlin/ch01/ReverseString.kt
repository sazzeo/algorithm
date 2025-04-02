package ch01

// https://leetcode.com/problems/reverse-string/
class ReverseString {

    //4ms
    fun solution1(s: CharArray): Unit {
        var start = 0
        val size = s.size
        var end = size - 1
        //람다 사용하면 더 느림
        (1..size / 2).forEach {
            val temp = s[start]
            s[start] = s[end]
            s[end] = temp
            start++
            end--
        }
    }

    //2ms
    fun solution2(s: CharArray): Unit {
        var start = 0
        var end = s.size - 1
        while (start < end ) {
            val temp = s[start]
            s[start] = s[end]
            s[end] = temp
            start++
            end--
        }
    }

}

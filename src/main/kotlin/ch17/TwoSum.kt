package ch17

object TwoSum {

    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/1633719946/
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var p1 = 0
        var p2 = numbers.size - 1

        while (p1 < p2) {
            val leftNum = numbers[p1]
            val rightNum = numbers[p2]
            val sum = leftNum + rightNum
            if (sum == target) {
                return intArrayOf(p1, p2)
            } else if (sum < target) {
                p1++
            } else {
                p2--
            }
        }
        throw RuntimeException()
    }

}

package ch01

object ArrayPairSum {

//    https://leetcode.com/problems/array-partition/
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var sum = 0
        val count = nums.size / 2
        for (i in 0 until count) {
            sum += nums[i * 2]
        }
        return sum
    }
}
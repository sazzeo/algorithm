package ch01

object ThreeSum {

    //https://leetcode.com/problems/3sum/
    //455 성능 최악
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val resArr = mutableListOf<List<Int>>()

        for (i in 0 until nums.size - 1) {
            val target = nums[i]
            if(target > 0 ) {
                break
            }
            val res = twoSum(nums, -target, i + 1)
            res.map { resArr.add(it) }
        }

        return resArr.distinct()
    }

    private fun twoSum(numbers: IntArray, target: Int, startLeftNum: Int): MutableList<List<Int>> {
        var p1 = startLeftNum
        var p2 = numbers.size - 1

        val res = mutableListOf<List<Int>>()
        while (p1 < p2) {
            val leftNum = numbers[p1]
            val rightNum = numbers[p2]
            val sum = leftNum + rightNum
            if (sum == target) {
                res.add(listOf(-target, leftNum, rightNum))
                p1++
                p2--
            } else if (sum < target) {
                p1++
            } else {
                p2--
            }
        }
        return res
    }
}
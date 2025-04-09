package ch17

class SortColors {

    fun sortColors(nums: IntArray): Unit {
        var zeroNum = 0
        var oneNum = 0
        for (i in nums) {
            when (i) {
                0 -> zeroNum++
                1 -> oneNum++
            }
        }
        for (i in 0..<zeroNum) {
            nums[i] = 0
        }
        for (i in zeroNum..<zeroNum + oneNum) {
            nums[i] = 1
        }
        for (i in zeroNum + oneNum..<nums.size) {
            nums[i] = 2
        }

    }
}

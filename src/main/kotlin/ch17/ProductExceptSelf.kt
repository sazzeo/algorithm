package ch17

//https://leetcode.com/problems/product-of-array-except-self
object ProductExceptSelf {
    //32ms
    fun productExceptSelf(nums: IntArray): IntArray {
        val size = nums.size

        val prefixArr = MutableList(size - 1) { 0 }
        val suffixArr = MutableList(size - 1) { 0 }
        var preMultiplication = 1
        var suffixMultiplication = 1
        for (i in 0 until size - 1) {
            preMultiplication *= nums[i]
            prefixArr[i] = preMultiplication
            suffixMultiplication *= nums[size - i - 1]
            suffixArr[size - i - 2] = suffixMultiplication
        }
        val res = mutableListOf<Int>()
        for (i in 0 until size) {
            val prefix = if (i == 0) 1 else prefixArr[i - 1]
            val suffix = if (i == size - 1) 1 else suffixArr[i]
            res.add(prefix * suffix)
        }

        return res.toIntArray()
    }

    //List -> IntArray 로 변경 -> 4ms
    fun productExceptSelf2(nums: IntArray): IntArray {
        val size = nums.size

        val prefixArr = IntArray(size - 1)
        val suffixArr = IntArray(size - 1)
        var preMultiplication = 1
        var suffixMultiplication = 1
        for (i in 0 until size - 1) {
            preMultiplication *= nums[i]
            prefixArr[i] = preMultiplication
            suffixMultiplication *= nums[size - i - 1]
            suffixArr[size - i - 2] = suffixMultiplication
        }
        val res = IntArray(size)
        for (i in 0 until size) {
            val prefix = if (i == 0) 1 else prefixArr[i - 1]
            val suffix = if (i == size - 1) 1 else suffixArr[i]
            res[i] = (prefix * suffix)
        }

        return res
    }


    //배열 한개 제거
    fun productExceptSelf3(nums: IntArray): IntArray {
        val size = nums.size
        val suffixArr = IntArray(size - 1)
        var suffixMultiplication = 1
        for (i in 0 until size - 1) {
            suffixMultiplication *= nums[size - i - 1]
            suffixArr[size - i - 2] = suffixMultiplication
        }

        var preMultiplication = 1
        val res = IntArray(size)
        for (i in 0 until size) {
            preMultiplication *= if (i == 0) 1 else nums[i - 1]
            val suffix = if (i == size - 1) 1 else suffixArr[i]
            res[i] = (preMultiplication * suffix)
        }

        return res
    }


}
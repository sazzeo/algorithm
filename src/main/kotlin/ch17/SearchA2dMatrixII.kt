package ch17

object SearchA2dMatrixII {

    //193ms
    //https://leetcode.com/problems/search-a-2d-matrix-ii/
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        val maxIndex = findMaxIndex(matrix[0], target)
        if (maxIndex == -1) {
            return true
        }

        for (element in matrix) {
            if (search(element, target, maxIndex)) {
                return true
            }
        }
        return false
    }

    private fun findMaxIndex(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex
        while (left <= right) {
            val point = (right + left) / 2
            if (nums[point] < target) {
                left = point + 1
            } else if (nums[point] > target) {
                right = point - 1
            } else {
                return -1
            }
        }

        return nums.lastIndex
    }


    private fun search(nums: IntArray, target: Int, maxIndex: Int): Boolean {
        var left = 0
        var right = maxIndex
        if (target < nums[0]) {
            return false
        }
        while (left <= right) {
            val point = (right + left) / 2
            if (nums[point] < target) {
                left = point + 1
            } else if (nums[point] > target) {
                right = point - 1
            } else {
                return true
            }
        }

        return false
    }
}
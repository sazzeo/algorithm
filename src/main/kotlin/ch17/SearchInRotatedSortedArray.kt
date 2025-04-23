package ch17

object SearchInRotatedSortedArray {

    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = (left + right) / 2
            if (nums[right] < nums[mid]) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        val pivot = left

        while (left <= right) {
            val mid = (left + right) / 2
            val midPivot = (mid + pivot) % nums.size

            when {
                nums[midPivot] < target -> left = mid + 1
                nums[midPivot] > target -> right = mid - 1
                else -> return midPivot
            }

        }
        return -1
    }
}

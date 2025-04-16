package ch17

//https://leetcode.com/problems/binary-search/description/
class BinarySearch {

    fun search(nums: IntArray, target: Int): Int {
        var left = 0;
        var right = nums.lastIndex

        while (left <= right) {
            val point =  (right + left) / 2
            if (nums[point] < target) {
                left = point + 1
            } else if (nums[point] > target) {
                right = point-1
            } else {
                return point
            }
        }

        return -1
    }
}

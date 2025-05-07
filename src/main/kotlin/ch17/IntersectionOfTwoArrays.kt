package ch17

import java.util.*

object IntersectionOfTwoArrays {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()

        var p1 = 0
        var p2 = 0
        val res = mutableSetOf<Int>()

        while (p1 < nums1.size && p2 < nums2.size) {
            if(nums1[p1] < nums2[p2]) {
                p1++
            }else if(nums1[p1] > nums2[p2]) {
                p2++
            }else if(nums1[p1] == nums2[p2]) {
                res.add(nums1[p1])
                p1++
                p2++
            }
        }
        return res.toIntArray()
    }

}

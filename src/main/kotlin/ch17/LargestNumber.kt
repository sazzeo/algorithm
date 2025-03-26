package ch17

// 67번
// https://leetcode.com/problems/valid-palindrome/description/
class LargestNumber {

    //32ms
    fun largestNumber(nums: IntArray): String {
        if (nums.isEmpty()) return ""
        if (nums.size == 1) {
            return nums[0].toString()
        }
        val sortedArr = nums.sortedWith { o1, o2 ->
            -(o1.toString() + o2).compareTo((o2.toString() + o1))
        }

        if (sortedArr.first() == 0) {
            return "0"
        }

        return sortedArr.joinToString("")
    }


    //25 : fold 쓰는게 더 성능 좋게 나옴 , String 과 StringBuilder는 차이없는듯
    fun largestNumber2(nums: IntArray): String {
        if (nums.isEmpty()) return ""
        if (nums.size == 1) {
            return nums[0].toString()
        }
        val sortedArr = nums.sortedWith { o1, o2 ->
            -(o1.toString() + o2).compareTo((o2.toString() + o1))
        }

        if (sortedArr.first() == 0) {
            return "0"
        }
        return sortedArr.fold(StringBuilder()) { acc, e ->
            acc.append(e)
            acc
        }.toString()
    }

}
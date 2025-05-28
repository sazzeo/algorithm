package ch01

import io.kotest.core.spec.style.StringSpec

class ThreeSumTest : StringSpec({

    "test1" {
        val nums = intArrayOf(-1,0,1,2,-1,-4)
        val res = ThreeSum.threeSum(nums)
        res.forEach(::println)
    }

})
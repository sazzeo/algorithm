package ch17

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class IntersectionOfTwoArraysTest : StringSpec({

    "test1" {
        val res = IntersectionOfTwoArrays.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
        res shouldBe intArrayOf(2)
    }


    "test2" {
        val res = IntersectionOfTwoArrays.intersection(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4))
        res shouldBe intArrayOf(4,9)
    }


})

package ch17

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TwoSumTest : StringSpec({

    "test" {
        TwoSum.twoSum(intArrayOf(2, 7, 11, 15), 9)
    }

})
